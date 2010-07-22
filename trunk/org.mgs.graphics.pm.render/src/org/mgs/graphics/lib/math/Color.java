package org.mgs.graphics.lib.math;

public class Color {
	public double r;
	public double g;
	public double b;
	public double a;

	public Color(double level) {
		this.r = level;
		this.g = level;
		this.b = level;
		this.a = 1.0;
	}
	public Color(Color color) {
		this.r = color.r;
		this.g = color.g;
		this.b = color.b;
		this.a = color.a;
	}
	public Color(double r, double g, double b) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = 1.0;
	}
	public Color(double r, double g, double b, double a) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}
	
	public static Color mix(Color a, Color b){
		return mix(a, b, 0.5);
	}
	public static Color mix(Color a, Color b, double t){
		double it = 1 - t;
		return new Color(a.r * it + b.r * t, a.g * it + b.g * t, a.b * it + b.b * t, a.a * it + b.a * t);
	}

	public Color multiply(double s){
		return new Color(r*s,g*s,b*s,a*s);
	}
	public Color multiply(Color c){
		return new Color(r*c.r,g*c.g,b*c.b,a*c.a);
	}
	public Color add(Color c){
		return new Color(r+c.r,g+c.g,b+c.b,a+c.a);
	}
	
	public int getRGB(){
		limit();
		return (((int)(r * 255)) << 16) | (((int)(g * 255)) << 8) | (((int)(b * 255)) << 0);
	}
	
	public static Color multiply(Color a, Color b){
		return new Color(a.r*b.r, a.g*b.g, a.b*b.b, a.a*b.a);
	}
	public static Color multiply(Color a, double s){
		return new Color(a.r*s, a.g*s, a.b*s, a.a*s);
	}
	public static Color add(Color a, Color b){
		return new Color(a.r+b.r, a.g+b.g, a.b+b.b, a.a+b.a);
	}

	public void limit(){
		r = limit(r);
		g = limit(g);
		b = limit(b);
		a = limit(a);
	}
	
	private static double limit(double v){
		return v < 0 ? 0 : (v > 1 ? 1 : v);
	}
}
