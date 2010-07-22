package org.mgs.graphics.lib.math;

public abstract class Util {
	/**
	 * retourne le plus petit entier inferieur.
	 * @param value
	 * @return
	 */
	public static int integerValue(double value){
		return (int)(value < 0 ? value - 1 : value);
	}
	/**
	 * retourne la partie fractionnaire.
	 * @param value
	 * @return
	 */
	public static double remainValue(double value){
		return value - (double)integerValue(value);
	}
	
	/**
	 * retourne la spline cubique.
	 * @param t le param�tre de 0 � 1.
	 * @param points les 4 points d'interpolation.
	 * @return
	 * @see Texturing & Modeling - A Procedural Approach - 3rd Ed. - page 34-35.
	 */
	public static double cubicSpline(double t, double [] points){
		double c3 = -0.5 * points[0] + 1.5 * points[1] - 1.5 * points[2] + 0.5 * points[3];
		double c2 = points[0] - 2.5 * points[1] + 2 * points[2] - 0.5 * points[3];
		double c1 = - 0.5 * points[0] + 0.5 * points[2];
		double c0 = points[1];
		return (((c3 * t + c2) * t + c1) * t + c0);
	}
	
	public static double limit(double value){
		return Math.max(0, Math.min(1, value));
	}
}
