package abstr.extend;

import abstr.classes.Shape3D;

public class ElipsCylindr extends Shape3D {
	private int a;
	private int b;
	
	public ElipsCylindr(int height, int a, int b) {
		super(height);
		this.a = a;
		this.b = b;
	}
	
	
	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
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

}
