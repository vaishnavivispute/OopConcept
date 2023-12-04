package basicConcept;

public class BasicDataType {
  //Instance /Global variable
	int a = 10;
	int b = 20;
	public void addition() {
		int c = 0;
		System.out.println(c = a + b);
	}
	
	//Local Variable
	public void mul() {
		int a1 = 100;
		int b1 = 200;
		int c1, d1;
		System.out.println(c1 = a1 + b1);
		System.out.println(c1 = a1 * b1);
		System.out.println(d1 = a + b); //WITHIN THIS METHOD WE USED a and b INSTANCE VARIABLE.
	}
	
	public static void main(String[] args) {
    BasicDataType b = new BasicDataType();
    b.addition();
    b.mul();
	}

}
