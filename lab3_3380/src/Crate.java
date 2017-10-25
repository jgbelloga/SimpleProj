
import java.util.Scanner;

//This method has to be abstract to implement interface
public abstract class Crate implements Package {
	
	private double weight;

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please input the weight for the ");
		System.out.print(this instanceof MetalCrate ? "MetalCrate (lbs) : " : "WoodCrate (lbs) : ");
		weight = scan.nextDouble();
	}

	public double getWeight() {
		return weight;
	}

}
