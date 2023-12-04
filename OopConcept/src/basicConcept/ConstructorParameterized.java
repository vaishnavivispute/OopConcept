package basicConcept;

public class ConstructorParameterized {
	
	//parameterized constructor declaration same as of class name
	//More constructor in program known as constructor overloading.
	public ConstructorParameterized(int i ,int j) {
		int k;
		System.out.println(k = i + j);
		System.out.println("I'm type 1 paramerized constructor");
		
	}
	
	public ConstructorParameterized(float a1, int b1) {
		float c1 = a1 + b1;
		System.out.println(c1);
		System.out.println("I'm type 2 paramerized constructor");
	}
	
	
	public ConstructorParameterized(int i1, int i2, int i3) {
		int i4 = i1 * i2* i3;
		System.out.println(i4);
		System.out.println("I'm type 3 paramerized constructor");
	}
	
	public void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		//creating object
		ConstructorParameterized cp = new ConstructorParameterized(100, 200);
		ConstructorParameterized cp1 = new ConstructorParameterized(10.5f, 100);
		ConstructorParameterized cp2 = new ConstructorParameterized(100, 200,300);
		cp.add();
		cp2.add();
		System.out.println("Job Done");
		
		
		
		

	}

}
