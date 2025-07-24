package chap06_05;

public class SingleTonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SingleTonTest singleTonTest = new SingleTonTest(); /생성자를 프라이빗으로 바꿔서 못불러옴
//		singleTonTest.getInstance();
		
		
		
		SingleTonTest single1 = SingleTonTest.getInstance(); // return 값으로 singletontest 객체를 반환
		 // 싱글톤 객체를 불러올수있는 방법은 이런싟의 메서드방식밖에 없다 
		SingleTonTest single2 = SingleTonTest.getInstance();
		// 원본은 한개고 같은 객체를 반환하는중 
		if(single1 == single2) {
			System.out.println("같은 객체를 참조하고 있다");
		} else {
			System.out.println("같은 객체를 참조하지 않다");
		}
		
		//int scr = 300;
		//scr = 1000;    이런식이면 300이었던 값이 1000으로 바뀌면서 나와야하지만
					 //  밑에처럼 final 을 붙여버리면 고정값이 되어버려 초기화가 불가능함
		//final int scrr = 300;
		//scrr = 1000; 
		
	}

}
