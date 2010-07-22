package org.mgs.graphics.pm.render;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.mgs.graphics.lib.math.Point3D;
import org.mgs.graphics.lib.texture.FractalNoise;
import org.mgs.graphics.lib.texture.Marble;
import org.mgs.graphics.pm.pmDsl.BuiltInCall;
import org.mgs.graphics.pm.pmDsl.ColorDef;
import org.mgs.graphics.pm.pmDsl.ColorFloatDef;
import org.mgs.graphics.pm.pmDsl.Expression;
import org.mgs.graphics.pm.pmDsl.LiteralExpression;
import org.mgs.graphics.pm.pmDsl.MIX;
import org.mgs.graphics.pm.pmDsl.MarbleDef;
import org.mgs.graphics.pm.pmDsl.Model;
import org.mgs.graphics.pm.pmDsl.ModuleCall;
import org.mgs.graphics.pm.pmDsl.ModuleDef;
import org.mgs.graphics.pm.pmDsl.Operation;
import org.mgs.graphics.pm.pmDsl.OperationDef;
import org.mgs.graphics.pm.pmDsl.PerlinDef;
import org.mgs.graphics.pm.pmDsl.RADIAL;
import org.mgs.graphics.pm.pmDsl.SCALE;
import org.mgs.graphics.pm.pmDsl.SIN;
import org.mgs.graphics.pm.pmDsl.Stage;
import org.mgs.graphics.pm.pmDsl.Variant;
import org.mgs.graphics.pm.pmDsl.VariantExpression;

public class StageRenderer {

	public Image render(Model model) throws UnhandledExpression{
		
		Stage stage = model.getStage();
		
		int width = stage.getWidth();
		int height = stage.getHeight();
		
		RGB rgb = new RGB(0, 0, 0);
		
		Image image = new Image(null, width, height);
		GC gc = new GC(image);
		
		for(int y=0 ; y<height ; y++){
			for(int x=0 ; x<width ; x++){
				getColor(model.getStage(), rgb, 
						(float)x / (float)(width - 1), 
						(float)y / (float)(height - 1));
				gc.setForeground(new Color(null, rgb));
				gc.drawPoint(x, y);
			}
		}

		return image;
	}
	
	protected void getColor(Stage stage, RGB color, float x, float y) throws UnhandledExpression{
		GenericType value = computeExpression(stage.getOutput(), x, y);
		color.red = floatTo8Bits(value.getR());
		color.green = floatTo8Bits(value.getG());
		color.blue = floatTo8Bits(value.getB());
	}
	
	private int floatTo8Bits(float v){
		return (int)(Math.max(0, Math.min(1, v)) * 255);
	}
	
	protected GenericType computeExpression(Expression e, float x, float y) throws UnhandledExpression{
		if(e instanceof Operation){
			return computeOperation((Operation)e, x, y);
		} else if(e instanceof ModuleCall){
			return computeModuleCall((ModuleCall)e, x, y);
		} else if(e instanceof BuiltInCall){
			return computeBuiltInCall((BuiltInCall)e, x, y);
		} else if(e instanceof VariantExpression){
			return computeVariantExpression((VariantExpression)e, x, y);
		}else if(e instanceof LiteralExpression){
			return new ScalarType(((LiteralExpression)e).getValue());
		}
		throw new UnhandledExpression(e);
	}
	
	protected GenericType computeVariantExpression(VariantExpression e, float x, float y) throws UnhandledExpression{
		Variant v = ((VariantExpression)e).getVariant();
		if(v == Variant.X){
			return new ScalarType(x);
		} else if(v == Variant.Y){
			return new ScalarType(y);
		}
		throw new UnhandledExpression(e);
	}
	protected GenericType computeBuiltInCall(BuiltInCall e, float x, float y) throws UnhandledExpression{
		if(e instanceof MIX){
			return computeMIX((MIX)e, x, y);
		} else if(e instanceof SIN){
			return computeSIN((SIN)e, x, y);
		} else if(e instanceof SCALE){
			return computeSCALE((SCALE)e, x, y);
		} else if(e instanceof RADIAL){
			return computeRADIAL((RADIAL)e, x, y);
		}
		throw new UnhandledExpression(e);
	}
	protected GenericType computeOperation(Operation e, float x, float y) throws UnhandledExpression{
		// compute the left and the right.
		GenericType left = computeExpression(e.getLeft(), x, y);
		GenericType right = computeExpression(e.getRight(), x, y);
		// execute operation.
		if(e.getOp().equals("+")){
			return left.add(right);
		}else if(e.getOp().equals("-")){
			return left.sub(right);
		}else if(e.getOp().equals("*")){
			return left.mul(right);
		}
		throw new UnhandledExpression(e);
	}
	protected GenericType computeModuleCall(ModuleCall e, float x, float y) throws UnhandledExpression{
		return computeModuleDef(e.getRef(), x, y);
	}	
	
	protected GenericType computeOperationDef(OperationDef e, float x, float y) throws UnhandledExpression{
		return computeExpression(e.getOutput(), x, y);
	}	
	
	private GenericType computeModuleDef(ModuleDef ref, float x, float y) throws UnhandledExpression {
		if(ref instanceof OperationDef){
			return computeOperationDef((OperationDef)ref, x, y);
		} else if(ref instanceof ColorDef){
			return computeColorDef((ColorDef)ref, x, y);
		} else if(ref instanceof PerlinDef){
			return computePerlinDef((PerlinDef)ref, x, y);
		} else if(ref instanceof MarbleDef){
			return computeMarbleDef((MarbleDef)ref, x, y);
		} 
		throw new UnhandledExpression(ref);
	}
	protected GenericType computeColorDef(ColorDef ref, float x, float y) throws UnhandledExpression {
		return computeEObject(ref.getDef());
	}
	private GenericType computeEObject(EObject def) throws UnhandledExpression {
		if(def instanceof ColorFloatDef){
			return computeColorFloatDef((ColorFloatDef)def);
		}
		throw new UnhandledExpression(def);
	}
	protected GenericType computePerlinDef(PerlinDef ref, float x, float y) {
		int seed = ref.getSeed();
		int octavia = ref.getIterations();
		double persistence = ref.getTurbulence();
		FractalNoise noise = new FractalNoise(seed, octavia, persistence);
		double value = noise.getValue(new Point3D(x, y, 0));
		return new ScalarType((float)value);
	}
	protected GenericType computeMarbleDef(MarbleDef ref, float x, float y) {
		int seed = ref.getSeed();
		Marble noise = new Marble(seed);
		double value = noise.getValue(new Point3D(x, y, 0));
		return new ScalarType((float)value);
	}

	protected GenericType computeColorFloatDef(ColorFloatDef def) {
		return new ColorType(def.getR(), def.getG(), def.getB(), def.getA());
	}

	protected GenericType computeMIX(MIX e, float x, float y) throws UnhandledExpression{
		// compute the operands.
		GenericType a = computeExpression(e.getA(), x, y);
		GenericType b = computeExpression(e.getB(), x, y);
		GenericType t = computeExpression(e.getT(), x, y);
		// compute.
		return a.mul(new ScalarType(1 - t.getValue())).add(b.mul(new ScalarType(t.getValue())));
	}
	protected GenericType computeSIN(SIN e, float x, float y) throws UnhandledExpression{
		// compute the operands.
		GenericType a = computeExpression(e.getA(), x, y);
		// compute.
		return new ScalarType(0.5f + (float)Math.sin(a.getValue() * Math.PI * 2) / 2);
	}
	protected GenericType computeSCALE(SCALE e, float x, float y) throws UnhandledExpression{
		// compute the operands.
		GenericType r = computeExpression(e.getRate(), x, y);
		// compute.
		return computeExpression(e.getExpression(), x * r.getValue(), y * r.getValue());
	}
	protected GenericType computeRADIAL(RADIAL e, float x, float y) throws UnhandledExpression{
		float mx = x - 0.5f;
		float my = y - 0.5f;
		// compute the operands.
		float angle = (float)(Math.atan2(my, mx) / (Math.PI * 2));
		float length = (float)Math.sqrt(mx * mx + my * my);
		// compute.
		return computeExpression(e.getExpression(), angle, length);
	}
	
}
