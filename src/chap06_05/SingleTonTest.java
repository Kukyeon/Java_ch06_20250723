package chap06_05;

public class SingleTonTest {

	//메모리에 딱 꼭 반드시 하나만 있어야하는 인스턴스를 만들어주는 클래스
	//프라이빗 스테틱으로 정적필드 로 만들어야함 
	private static SingleTonTest singleTonTest = new SingleTonTest();

	private SingleTonTest() {
	
	}
	
	public static SingleTonTest getInstance() {
		return singleTonTest;
	}
	
	
}
