public class GreenTurtleShell implements Shell{
	@Override
	public void throwShell() {
		System.out.println("The shell is thrown in a straight line, hitting anyone or anything in its trajectory!");
	}

	@Override
	public void protectAnimal() {
		System.out.println("The shell serves its natural biological process of protecting an animal.");
	}
}
