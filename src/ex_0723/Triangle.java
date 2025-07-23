package ex_0723;

public class Triangle {

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
		if (a+b > c && a+c > b && b+c > a);
		return true;
	} 
	
	
	
}
