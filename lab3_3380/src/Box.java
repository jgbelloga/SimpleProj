
import java.util.Scanner;

public class Box implements Package {
	
	private double weight;

	public double cost() {
		return ((1.2) * weight);
	}

	public void input() {
		System.out.print("Please input the weight for the Box: (lbs) : ");
		Scanner scan2 = new Scanner(System.in);
		weight = scan2.nextDouble();
	}


}
