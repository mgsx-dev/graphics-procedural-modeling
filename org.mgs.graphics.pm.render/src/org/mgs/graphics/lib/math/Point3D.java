package org.mgs.graphics.lib.math;

public class Point3D {
	public double x;
	public double y;
	public double z;

	public Point3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Point3D(Point3D p) {
		this.x = p.x;
		this.y = p.y;
		this.z = p.z;
	}

	public void reflect(Point3D n){
		n.normalize();
		add(multiply(n, dot(n) * -2.0));
		normalize();
	}
	public void add(Point3D p){
		x += p.x;
		y += p.y;
		z += p.z;
	}
	public void multiply(double s){
		x *= s;
		y *= s;
		z *= s;
	}
	public static Point3D multiply(Point3D p, double s){
		return new Point3D(p.x*s, p.y*s, p.z*s);
	}
	public double dot(Point3D p){
		return x*p.x + y*p.y + z*p.z;
	}
	public void normalize(){
		multiply(1 / length());
	}
	public double length(){
		return Math.sqrt(dot(this));
	}
	public static Point3D subtract(Point3D a, Point3D b){
		return new Point3D(a.x-b.x,a.y-b.y,a.z-b.z);
	}
	public static Point3D add(Point3D a, Point3D b){
		return new Point3D(a.x+b.x,a.y+b.y,a.z+b.z);
	}
}
