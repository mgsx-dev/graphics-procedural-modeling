package org.mgs.graphics.pm.render;

interface GenericType{
	public float getA();
	public float getB();
	public float getG();
	public float getR();
	public float getValue();
	public GenericType add(GenericType object);
	public GenericType sub(GenericType object);
	public GenericType mul(GenericType object);
}