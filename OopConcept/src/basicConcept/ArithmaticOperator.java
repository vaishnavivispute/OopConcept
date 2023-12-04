package basicConcept;

public class ArithmaticOperator {
	
	int a = 10;
	int b = 20;
	int c;
	
	public void add() {
		 c = a + b;
		System.out.println(c);
	}
	
	public void sub() {
		c = a - b;
		System.out.println(c);
	}
	
	public void mul() {
		c = a * b;
		System.out.println(c);
	}
	 public void div() {
		 c = b / a;
		 System.out.println(c);
	 }

	public static void main(String[] args) {
	 ArithmaticOperator a = new ArithmaticOperator();
	 a.add();
	 a.sub();
	 a.mul();
	 a.div();

	}

}
