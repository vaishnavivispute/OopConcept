package exercise;

public class Exer_2 implements Exer_22 {

	
	int a = 100;
	int b = 200;
	int c;
	

	@Override
	public void add() {
		
       c = a + b;
       System.out.println("Addition of two number is:"+c);
		
	}

	@Override
	public void sub() {
		
	     c = a - b;
	     System.out.println("Subtraction of two number is:"+c);
		
	}

	@Override
	public void mul() {
		
	     c = a * b;
	     System.out.println("Multiplication of two number is:"+c);
	}

	@Override
	public void div() {
		
	     c = b / a;
	     System.out.println("Division of two number is:"+c);
	}
	
	public static void main(String[] args) {
		Exer_2 ac = new Exer_2();
		ac.add();
		ac.sub();
		ac.mul();
		ac.div();
		System.out.println("Exercise is completed");
		

	}

}
