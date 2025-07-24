package ex_0723;

public class Rectangle {

//	5. 사각형의 가로와 세로 길이를 입력받아 사각형의 둘레를 출력하는 Rectangle 클래스를 만드시오. 
//	단, 생성자에서 가로와 세로를 입력 받고 가로와 세로 길이는 정수와 실수 모두 입력받을 수 있도록 생성하시오.
//	(생성자 오버로딩 정수,실수 둘다 받아야함
	
	
	
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
		System.out.println(angle);
	}
	
	
	
	
}
