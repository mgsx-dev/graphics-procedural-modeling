package org.mgs.graphics.pm.render;

class ColorType implements GenericType{
	float r, g, b, a;

	public ColorType(float r, float g, float b, float a) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}

	@Override
	public float getA() {
		return a;
	}

	@Override
	public float getB() {
		return b;
	}

	@Override
	public float getG() {
		return g;
	}

	@Override
	public float getR() {
		return r;
	}

	@Override
	public GenericType add(GenericType object) {
		if(object instanceof ColorType){
			ColorType c = (ColorType)object;
			return new ColorType(r + c.r, g + c.g, b + c.b, a + c.a);
		}else{
			ScalarType s = (ScalarType)object;
			return new ColorType(r + s.value, g + s.value, b + s.value, a + s.value);
		}
	}

	@Override
	public GenericType sub(GenericType object) {
		if(object instanceof ColorType){
			ColorType c = (ColorType)object;
			return new ColorType(r - c.r, g - c.g, b - c.b, a - c.a);
		}else{
			ScalarType s = (ScalarType)object;
			return new ColorType(r - s.value, g - s.value, b - s.value, a - s.value);
		}
	}

	@Override
	public GenericType mul(GenericType object) {
		if(object instanceof ColorType){
			ColorType c = (ColorType)object;
			return new ColorType(r * c.r, g * c.g, b * c.b, a * c.a);
		}else{
			ScalarType s = (ScalarType)object;
			return new ColorType(r * s.value, g * s.value, b * s.value, a * s.value);
		}
	}

	@Override
	public float getValue() {
		return (r + g + b + a) / 4.f;
	}
}