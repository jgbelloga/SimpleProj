
public class MetalCrate extends Crate implements Package{
	
	public double cost() {
		return ((1.3) * this.getWeight());
	}
	
}
