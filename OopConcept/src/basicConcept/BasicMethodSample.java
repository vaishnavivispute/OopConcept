package basicConcept;      


public class BasicMethodSample {
	
	int i=100; //global variable
	public void method1() //method without parameter
	{
		System.out.println("Hello");
	}
	                                    

	public void method1(int a, int b) //method with parameter
	{
		int c =a+b; //local variable
		int d =c+i; //using global variable
		System.out.println(c);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		BasicMethodSample b = new BasicMethodSample();
		b.method1();
		b.method1(10,10);
		

	}

}
