package exercise;

public class Exer_11 implements Exer_1{



	@Override
	public void print() {
		System.out.println("I am in print method");
		
	}

	@Override
	public void addtionalprint() {
		System.out.println("I am in addtional print method and It is method of interface class");
		
	}

	public void advanceprint() {
		System.out.println("Hey! I am in advance print method!");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exer_11 in = new Exer_11();
		in.print();
		in.addtionalprint();
		in.advanceprint();
	}

}
