package abstr.extend;

import abstr.classandinterf.Shape2D;
import abstr.classandinterf.Shape3D;

public class CifcleCylindrClassInt extends Shape2D implements Shape3D {
	private double height;
	private double radius;
	
	public CifcleCylindrClassInt(double height, double radius) {
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
	public double getSurface() {
		return 2*getSquare()+height*getPerim();
	}

	@Override
	public double getVolume() {
		return getSquare()*Math.PI;
	}

	@Override
	public double getPerim() {
		return 2*radius*Math.PI;
	}

	@Override
	public double getSquare() {
		return Math.PI*radius*radius;
	}

}
