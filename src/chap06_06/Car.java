package chap06_06;

import chap06_06_01.Autocar;

public class Car {

	
	public static void main() {
		
	Autocar autocar = new Autocar(); // 다른 패키지
	// 다른패키지에서 불러올경우 임포트 필수
	Tire tire = new Tire(); // 같은 패키지
	//퍼플릭이 없어도 같은 패키지 내에선 가져다쓸수있음
	// 단 프라이빗이 되면 못가져다씀
	// prrtected 는 같은 패키지 내에서만 접근 가능한 메소드로 지정
	tire.tireName = "금호";
	tire.tirePrice = 20202020;
	tire.tirePrint();
	}
}
