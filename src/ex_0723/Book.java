package ex_0723;

public class Book {

	int pay;
	String name;
	
	public Book(int pay, String name) {
		this.name = name;
		this.pay = pay;
	}	
	public void printInfo() {
	System.out.println(name + "은(는)" + pay + "원 입니다." );
	}
	
	
}
