package chap06_04;

public class Rectangle {

	int width;
	int height;
	String color;
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rectangle(int width, int height, String color) {
		super();
		this.width = width;
		this.height = height;
		this.color = color;
	}
	// 메소드 오버로딩 / 변수만 다르게 하여 다양한 메소드
	public int rectArea() {
		return width * height;
	}
	
	public int rectArea(int width, int height) {
		return width * height;
	}
	
	public int rectArea(int width) {
		return width * this.height;
	}
	
	public double rectArea(double width) {
		return width * this.height;
	}
}
