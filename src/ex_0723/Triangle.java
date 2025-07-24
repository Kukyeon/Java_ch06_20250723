package ex_0723;

public class Triangle {

	
	
//	6. 세변의 길이를 입력 받아 삼각형인지 아닌지 판별할 수 있는 Triangle 클래스를 만드시오. 
//	boolean isValid 메서드는 세변으로 삼각형인지 여부를 판별하는 메서드로 두 변 합
//	> 나머지 변 의 조건을 만족하면 true 로 출력하는 메서드로 만들어 생성하시오.
	//a+b>c / a+c>b / b+c >a
	
	int a;
	int b; 
	int c;
	
	public Triangle(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isValid() {
		// boolean flag = (a + b) > c && (a + c) > b && (b + c) > a;
		// return flag; if 를 안쓰는 방식
		if (a+b > c && a+c > b && b+c > a);
		return true;
	} 
	
	
	
}
