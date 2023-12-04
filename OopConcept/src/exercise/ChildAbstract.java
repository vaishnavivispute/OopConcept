package exercise;

public class ChildAbstract extends ParentAbstract {

	

	@Override
	public void add() {
		System.out.println("Hi! I'm abstract method");
	}
	
	public static void main(String[] args) {
		ChildAbstract ca = new ChildAbstract();
		ca.add();
		ca.print();
		ca.additionalprint();

	}

}
