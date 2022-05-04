package helloworld;

public class Factorial {

	public int fact(int number) {
		
		int fact=1;
		int n = number;
		for(int i=n;i>=1;i--) {
			fact = fact*i;
		}
		
		return fact;
	}
	
}
