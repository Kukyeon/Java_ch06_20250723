package ex_0723;

public class Bmi {
	
//	4. BMI 계산기 클래스를 만들려고 한다. 
//	BMI의 계산식은 BMI = weight / (height²) 이다. 
//	키와 몸무게를 넣으면 BMI를 출력하는 bmiCalculator 메서드를 가지고 있는 BMI 계산기 클래스를 만드시오.
//	( 메서드만 만들면댐 
//	//  BMI = weight / (height²) 
	
	 
	public void bmiCalulator(double weight, double height) {
		double dmi = (weight / (height * height));
		System.out.println(dmi);
	}
	
	
}
