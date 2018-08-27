package abstr.extend;

import abstr.interfeises.Shape3D;

public class CircleCylindrInt implements Shape3D {
	private double height;
	private double radius;
	
	public CircleCylindrInt(double height, double radius) {
		super();
		this.height = height;
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getPerim() {
		return 2*Math.PI*radius;
	}

	@Override
	public double getSquare() {
		return Math.PI*radius*radius;
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
