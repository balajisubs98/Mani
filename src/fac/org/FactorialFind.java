package fac.org;

import java.util.Scanner;

public class FactorialFind {
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		int number = n.nextInt();
		
		int fact=1;
		
		for (int i = 1; i<=number; i++) {
			
			fact=fact*i;
			
		}
		
		System.out.println("factorial of the given number:"+fact);
		
	}

}
