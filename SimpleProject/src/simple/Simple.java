package simple;

import java.util.Scanner;

public class Simple {

	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 0;
		for(int i = 0; i < 10; i++) {
			
			result = n * (i + 1);
			System.out.println(n + " x " + (i + 1) + " = " + result);
		}
		
	}
}
