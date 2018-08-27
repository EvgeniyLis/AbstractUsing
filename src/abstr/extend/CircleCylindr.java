package abstr.extend;

import abstr.classes.Shape3D;

public class CircleCylindr extends Shape3D {
	private double radius;

	public CircleCylindr(int height, double radius) {
		super(height);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerim() {
		return 2*radius*Math.PI;
	}

	@Override
	public double getSquare() {
		return radius*radius*Math.PI;
	}

}
