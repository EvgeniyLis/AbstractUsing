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
	// ���������� ����������� ������� ��������� � ������� ���������
	abstract public double getPerim();
	abstract public double getSquare();
	//������������� ������
	public double getSurface() {
		return 2*getSquare()+height*getPerim();		
	}
	public double getVolume() {
		return getSquare()*height;
	}
}
