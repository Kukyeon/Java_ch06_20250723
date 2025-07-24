package ex_0723;

public class AverageCalculator {

	//3. 정수형 배열을 입력하면 배열의 모든 요소의 평균을 출력하는 
	// getAverage 메서드를 가지고 있는 AverageCalculator 클래스를 만드시오. 
	// ( 정수형 배열로 10,20,30,40,50을 받았으면 평균값 /메서드만)
	
	public void getAverage(int[] yam) {
		int sum = 0;
		for ( int num : yam ) {
			 sum += num;
		}
		System.out.println(sum / yam.length); // 나눗셈은 실수가 나올수도 있으니 double 합쳐주면 좋음;
	}
	
	
}
