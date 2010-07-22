package org.mgs.graphics.lib.texture;

import org.mgs.graphics.lib.math.Point3D;

public class FractalNoise extends Noise {
	protected int octavia;
	protected double persistence;
	
	public FractalNoise(long seed, int octavia, double persistence) {
		super(seed);
		this.octavia = octavia;
		this.persistence = persistence;
	}
	@Override
	public double getValue(Point3D point) {
		double value = 0;
		Point3D p = new Point3D(point);
		double amp = 1;
		double fac = 0;
		for(int i=0 ; i<octavia ; i++){
			value += 2 * (super.getValue(p) - 0.5) * amp;
			fac += amp;
			amp *= persistence;
			p.multiply(2);
		}
		return ((value / fac) + 1) / 2;
	}
}
