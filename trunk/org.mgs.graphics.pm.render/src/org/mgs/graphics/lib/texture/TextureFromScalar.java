package org.mgs.graphics.lib.texture;

import org.mgs.graphics.lib.math.Color;
import org.mgs.graphics.lib.math.Point3D;

public class TextureFromScalar extends Texture {

	private ScalarFromSpace scalarFromSpace;
	private Color zeroColor;
	private Color oneColor;
	
	public TextureFromScalar(ScalarFromSpace scalarFromSpace){
		this.scalarFromSpace = scalarFromSpace;
		this.zeroColor = new Color(0);
		this.oneColor = new Color(1);
	}
	public TextureFromScalar(ScalarFromSpace scalarFromSpace, Color zeroColor, Color oneColor){
		this.scalarFromSpace = scalarFromSpace;
		this.zeroColor = zeroColor;
		this.oneColor = oneColor;
	}
	
	@Override
	public Color getColor(Point3D texCoord) {
		return Color.mix(zeroColor, oneColor, scalarFromSpace.getValue(texCoord));
	}

}
