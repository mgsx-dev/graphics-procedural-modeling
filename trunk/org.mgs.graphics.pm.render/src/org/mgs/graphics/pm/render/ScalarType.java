package org.mgs.graphics.pm.render;


class ScalarType implements GenericType{
	float value;

	public ScalarType(float value) {
		super();
		this.value = value;
	}

	@Override
	public float getA() {
		return value;
	}

	@Override
	public float getB() {
		return value;
	}

	@Override
	public float getG() {
		return value;
	}

	@Override
	public float getR() {
		return value;
	}

	@Override
	public GenericType add(GenericType object) {
		if(object instanceof ScalarType){
			ScalarType s = (ScalarType)object;
			return new ScalarType(value + s.value);
		}else{
			ColorType c = (ColorType)object;
			return new ColorType(value + c.r, value + c.g, value + c.b, value + c.a);
		}
	}

	@Override
	public GenericType sub(GenericType object) {
		if(object instanceof ScalarType){
			ScalarType s = (ScalarType)object;
			return new ScalarType(value - s.value);
		}else{
			ColorType c = (ColorType)object;
			return new ColorType(value - c.r, value - c.g, value - c.b, value - c.a);
		}
	}

	@Override
	public GenericType mul(GenericType object) {
		if(object instanceof ScalarType){
			ScalarType s = (ScalarType)object;
			return new ScalarType(value * s.value);
		}else{
			ColorType c = (ColorType)object;
			return new ColorType(value * c.r, value * c.g, value * c.b, value * c.a);
		}
	}

	@Override
	public float getValue() {
		return value;
	}
}