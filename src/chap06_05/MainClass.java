package chap06_05;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StaticTest st1 = new StaticTest(); // 인스턴트 (객체) 생성
		
		st1.width = 10;
		st1.heigth = 20;
		st1.color = "red";
		
		
		StaticTest st2 = new StaticTest();
		
		st2.width = 50;
		st2.heigth = 60;
		st2.color = "blue";
//		st2.PI = 3.141592; final 필드로 인해 수정불가
		
	}

}
