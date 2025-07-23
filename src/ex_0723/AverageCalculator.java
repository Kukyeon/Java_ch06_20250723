package ex_0723;

public class AverageCalculator {

	
	public void getAverage(int[] yam) {
		int sum = 0;
		for ( int num : yam ) {
			 sum += num;
		}
		System.out.println(sum / yam.length);
	}
	
	
}
