public class ShellToBowlTester {
	public static void main(String[] args){
		GreenTurtleShell shell = new GreenTurtleShell();
		System.out.println("Shell:");
		shell.throwShell();
		shell.protectAnimal();
		Bowl bowl = new Bowl();
		BowlAdaptor totallyAShell = new BowlAdaptor(bowl);
		System.out.println("\nBowl:");
		totallyAShell.throwShell();
		totallyAShell.protectAnimal();
	}
}
