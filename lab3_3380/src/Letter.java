

import java.util.Scanner;

public class Letter implements Package {
	
	private double numOfPages;

	public double cost() {
		return ((5 * numOfPages) / (100));
	}

	public void input() {
		System.out.print("Please input the number of pages for the letter (pgs) : ");
		Scanner scan1 = new Scanner(System.in);
		numOfPages = scan1.nextDouble();
	}
}
