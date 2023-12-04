package basicConcept;

public abstract class BasicAbstract {
	int a1 = 10;
	int b1 = 20;
	int c1;
	
	/* Rule 1:Abstract class may or may not contain abstract method*/
	/* Rule 2:If a method is declared abstract,that class should be made abstract*/
	/* Rule 3:Abstract method allows only method declaration*/
	/* Rule 4:Abstract class allows both method declaration and definition*/
	/*interface methods are not allowed in abstract class*/
	/*Interface class does not allowed normal method its used only method declaration*/
	
	public abstract void sum();//Abstract method(Only definition allowed)
	
	public void add() {
		System.out.println("Hi!, I am in abstract method!");
		}
	
	//Non- abstract method allowing method definition
	public void multiply() {
		c1 = a1 * b1;
		System.out.println(c1);
	}
	
	
	

	public static void main(String[] args) {
		/*Rule 5:Creating object for abstract class is not possible*/
		/*Rule 6: Abstract class not allows instantiated(Object creation)*/
	}

}
