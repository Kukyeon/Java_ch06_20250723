package ex_0723;

public class MainClass {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 책 이름 가격 출력 
		
		Book book1 = new Book(16000, "해리포터");
		book1.printInfo();
				
		
		System.out.println("=============================");
		
		//2 StringTool
		
		StringTool tool = new StringTool();
		tool.printLength("밥먹을시간이다");
		   
		
		System.out.println("=============================");
		 
		 //3 getAverage
		 
		 AverageCalculator averageCalculator = new AverageCalculator(); 
		 int[] yam = {1,2,3,4,5};
		 averageCalculator.getAverage(yam);

		 
		 System.out.println("=============================");
		 
		 //4 BMI
		 
		 Bmi bmi = new Bmi();
		 bmi.bmiCalulator(88.0, 1.85);
		 
		 
		 System.out.println("=============================");
		 
		 //5 Rectangle
		 
		 Rectangle rectangle = new Rectangle(5, 3); // int
		 rectangle.printRectangle();
		 
		 Rectangle rectangle2 = new Rectangle(5.0, 3.0); // double
		 rectangle2.printRectangle();
		 
		 
		 System.out.println("=============================");
		 
		 
		 
		 //6 Triangle
		 
		 
		 Triangle tri = new Triangle(3, 4, 5);
		 System.out.println(tri.isValid());
		 
	}

}
