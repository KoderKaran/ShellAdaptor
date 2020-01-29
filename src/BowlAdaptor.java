public class BowlAdaptor implements Shell{
	private Bowl bowl;

	public BowlAdaptor(Bowl newBowl){
		bowl = newBowl;
	}

	@Override
	public void throwShell() {
		bowl.throwBowl();
	}

	@Override
	public void protectAnimal() {
		bowl.putOnAnimal();
	}
}
