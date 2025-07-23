package chap06_04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator cal1 = new Calculator();
		
		int result  = cal1.add(20, 10);
		System.out.println(result);
		
		int result2  = cal1.add2(20, 10);
		System.out.println(result2);
		
		int result3  = cal1.add3(20, 10);
		System.out.println(result3);
		
		int result4  = cal1.add4(20, 10);
		System.out.println(result4);
		
		
		int[] arr1 = {10, 20, 30};
		
		cal1.total(arr1);
		cal1.total(new int[] {10,20,30});
		
		
		System.out.println(cal1.total(arr1));
		System.out.println(cal1.total(new int[] {10,20,30}));
	
	}

}
