package ex_0723;

//1. 책의 이름과 가격을 필드로 가지는 Book 클래스를 만드시오. 
//단 생성자에서 두 필드를 초기화 하도록 만들고, 책의 이름과 가격을 출력하는 printInfo 메서드를 포함하시오.

public class Book {

	int pay;
	String name;
	
	public Book(int pay, String name) { // 클래스 생성
		this.name = name;
		this.pay = pay;
	}	
	public void printInfo() { // 매서드 생성
	System.out.println(name + "은(는)" + pay + "원 입니다." );
	}
	
	
}
