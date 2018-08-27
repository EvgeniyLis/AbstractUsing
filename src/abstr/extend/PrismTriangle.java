package abstr.extend;

import abstr.classes.Shape3D;

public class PrismTriangle extends Shape3D {
	private double a;
	private double b;
	private double c;
	
	public PrismTriangle(int height, double a, double b, double c) {
		super(height);
		this.a = a;
		this.b = b;
		this.c = c;
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


	public double getC() {
		return c;
	}


	public void setC(double c) {
		this.c = c;
	}


	@Override
	public double getPerim() {
		if (a<b+c && b<a+c && c<b+a) {
			return a+b+c;
		} else {
			return -1; 	
		}
	}


	@Override
	public double getSquare() {
		if (a<b+c && b<a+c && c<b+a) {
			return Math.sqrt(getPerim()/2*(getPerim()/2-a)*(getPerim()/2-b)*getPerim()/2-c);
		} else {
		return 1;
		}		
	}
}


