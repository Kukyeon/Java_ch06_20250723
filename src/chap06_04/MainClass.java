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
	
		System.out.println("=============================");
		// 생성자 오버로딩
		Rectangle rec1 = new Rectangle(20,10,"red");
		Rectangle rec2 = new Rectangle(result3, result4, null);
		
		// 메소드 오버로딩
		int area1 = rec1.rectArea();
		int area2 = rec1.rectArea(200);
		int area3 = rec1.rectArea(30, 40);// 오버로딩을 통해 여러가지 값을 가져올수있음
		
		System.out.println(area1); // 초기값으로 계산
		System.out.println(area2); // w만 200으로 넣어서 h는 기본값으로 계산
		System.out.println(area3); // w,h 둘다 새로운값을 넣어서 계산
	}

}
