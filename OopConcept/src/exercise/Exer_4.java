package exercise;

public class Exer_4 {
	
	static int a = 20;
	static int b = 30;
	static int c;
	
	public static void add() {
		c = a + b;
	    System.out.println("Addition of two number is:"+c);
		
	}

	public static void sub() {
		 c = a - b;
	     System.out.println("Subtraction of two number is:"+c);
		
	}
		
	
	public static void main(String[] args) {
		add();//Approach 1
		sub();
		Exer_4.add();//Approach 2
	}

}
