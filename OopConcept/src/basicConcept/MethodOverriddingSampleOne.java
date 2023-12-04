package basicConcept;
//Same method name but different definition or body is know as method overriding
//Method overriding:It allows only in inheritance
public class MethodOverriddingSampleOne extends MethodOverloadingSampleOne {

	int d = 50;
	int e = 100;
	int f;
	
	public void method1(int a, int b) {
		d = a + e;
		f = b + e;
		System.out.println(d);
		System.out.println(f);
	}
	
	
	public static void main(String[] args) {
		MethodOverriddingSampleOne ms1 = new MethodOverriddingSampleOne();
		ms1.method1(50,100);
		// TODO Auto-generated method stub

	}

}
