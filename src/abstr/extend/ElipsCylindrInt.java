package abstr.extend;

import abstr.interfeises.Shape3D;

public class ElipsCylindrInt implements Shape3D {
	private double height;
	private double a;
	private double b;
	

	public ElipsCylindrInt(double height, double a, double b) {
		super();
		this.height = height;
		this.a = a;
		this.b = b;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double getPerim() {
		return (a+b)/2*Math.PI;
	}

	@Override
	public double getSquare() {
		return a*b*Math.PI;
	}

	@Override
	public double getSurface() {
		return 2*getSquare()+height*getPerim();
	}

	@Override
	public double getVolume() {
		return getSquare()*height;
	}

}
