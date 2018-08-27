package abstr.classes;

public abstract class Shape3D {
	private int height;

	public Shape3D(int height) {
		super();
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	// объ€вление абстрактных методов периметра и площади основани€
	abstract public double getPerim();
	abstract public double getSquare();
	//реализованные методы
	public double getSurface() {
		return 2*getSquare()+height*getPerim();		
	}
	public double getVolume() {
		return getSquare()*height;
	}
}
