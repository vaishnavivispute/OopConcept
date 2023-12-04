package basicConcept;

public class BasicStaticKeyword {
	
	static int a = 10;
	static int b = 20;
	int c = 30;
  
	/*Rule 1: Accessing static variable in non-static method*/
	public void add() {
		int sum = a + b;//Accessing static variable in non static method is possible 
		System.out.println(sum);
	}

	/*Rule 2:Accessing non static variable in static method*/
	public static void sum() {
		//int sum = c;//Accessing non static variable in static method isn't possible
		
	}
	
	/* Rule 3 : Accessing static method in non static method*/
	public static void multiply() {
		int mul = a * b;
		System.out.println(mul);
	}
	
	public void sub() {
		multiply();//Accessing static method in non static method is possible.
		int sub = b - a;
		System.out.println(sub);
	}
	
	/* Rule 4: Accessing non static method in static method*/
	public void multiplication()
	{
		int mul = a * b;
		System.out.println(mul);
	}
	
	public static void subtraction() {
		//multiplication();//Accessing non static method in static method isn't possible
		int sub = b - a;
		System.out.println(sub);	
		}
	/* Rule 5 : Accessing static method in static method*/
	 public static void multi() {
		 int mul = a * b;
		System.out.println(mul);
	 }
	 
	 public static void subti() {
		 multi();//Accessing static method in static method is possible
		 int sub = b - a;
		System.out.println(sub);
	 }
	
	
	public static void main(String[] args) {
		 BasicStaticKeyword bs = new BasicStaticKeyword();
		 bs.add();//Non static method to call we use object
		 multi();//Static method we call directly without object creation.
		 subti();//Approach 1
		 BasicStaticKeyword.multi();
		// bs.multi(); We can also call the static method using object
		 
		 
	}

}
