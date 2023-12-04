package accessModifierOne;

public class PrivateModifierOne {
	//Private modifier won't be accessed in outside the class.
	private void display() {
		System.out.println("Hey!...I 'm private Modifier");
	}
	public void project() {
		System.out.println("Hey!...I 'm public Modifier");
	}
	
	public static void main(String args[]) {
		PrivateModifierOne pm = new PrivateModifierOne();
		pm.display();//Private modifier accessed within class.
		pm.project();
	}
}
