package pl.dopierala.Creational.DP_Prototype;

//Doesn't support cloning
public class General extends GameUnit{

	private String state = "idle";
	
	public void boostMorale() {
		this.state = "MoralBoost";
	}
	
	@Override
	public String toString() {
		return "General "+state+" @ "+getPosition();
	}

	//General class is not supporting cloning, throw an exception
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Generals are unique.");
	}

	@Override
	protected void reset() {
		throw new UnsupportedOperationException("Reset not supported.");
	}
}
