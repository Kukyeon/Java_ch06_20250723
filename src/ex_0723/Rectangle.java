package ex_0723;

public class Rectangle {

	
	
	double width;
	double heigth;
	
	
	public Rectangle(int width, int heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}


	public Rectangle(double width, double heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}
	
	 
	public void printRectangle() {
		double angle = (width + heigth) * 2;
		System.out.print(angle);
	}
	
	
	
	
}
