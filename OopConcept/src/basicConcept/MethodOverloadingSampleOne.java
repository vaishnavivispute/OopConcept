package basicConcept;

//We used different data type
//Same name but parameter is different we should call as "Method Overloading".
public class MethodOverloadingSampleOne{
	
	public void method1(int a) //method with parameter
	{
		System.out.println(a);
	}
	
	public void method1(int a, int b) {
		int d = 10;
		int c = a + b;
		System.out.println(c);
	    System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingSampleOne ms = new MethodOverloadingSampleOne();
		ms.method1(10);
		ms.method1(100, 100);

	}

}
