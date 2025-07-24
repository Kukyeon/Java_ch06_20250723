package chap06_06;

public class Tire {

	String tireName;
	int tirePrice;
	// prrtected 는 같은 패키지 내에서만 접근 가능한 메소드로 지정
	protected void tirePrint() {
		System.out.println("타타타타이어");
		
	}
}
