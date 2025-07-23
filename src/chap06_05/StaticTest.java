package chap06_05;

public class StaticTest {
	
		// 다른객체에서 수정하지 못하게 할때 final필드 추가 
		// final필드 없이 작성하면 값 수정가능;
		// static 선언시 this 사용 불가
	static final double PI = 3.14; // (static)멤버 - 정적멤버 - 정적변수 선언
	int width;
	int heigth;
	String color;
	
}
