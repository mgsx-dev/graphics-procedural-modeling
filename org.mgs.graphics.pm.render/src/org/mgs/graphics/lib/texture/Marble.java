package org.mgs.graphics.lib.texture;

import org.mgs.graphics.lib.math.Point3D;
import org.mgs.graphics.lib.math.Util;

public class Marble extends FractalNoise {
	public Marble(long seed){
		super(seed, 5, 0.5);
	}
	@Override
	public double getValue(Point3D point) {
		double value = super.getValue(point);
		return Util.limit(Math.abs((value - 0.5) * 8));
	}
	
	
}
