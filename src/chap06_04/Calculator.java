package chap06_04;

public class Calculator {

		
	public int add (int num1, int num2) { // 덧셈 메소드
		return  num1 + num2;
	}
	public int add2 (int num1, int num2) { //뺼셈셈 메소드
		return  num1 - num2;
	}	
	public int add3 (int num1, int num2) { // 곱셈 메소드
		return  num1 * num2;
	}	
	public int add4 (int num1, int num2) { // 나눗셈 메소드
		return  num1 / num2;
	}	
	
	public int total(int[] numbers) {
		int total = 0;
		for(int num:numbers) {
			total = total + num;
			
		}  return total;
		
//		public int total2(int ...numbers) {
//			int total = 0;
//			for(int num:numbers) {
//				total = total + num;
//		} return total;
		 //다른방법
	
	
		
		
		
	} 
		
	}
	
		

