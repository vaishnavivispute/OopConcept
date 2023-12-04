package basicConcept;

public class ConstructorDefault {
	
	public void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	public void addition() {
		
	}

	public static void main(String[] args) {
    //creating object for a class. During this object creation
	//the constructor will also executed.
    ConstructorDefault c = new ConstructorDefault(); //Default Constructor
  
    //Using object calling the class method (add) and printing sysout
    c.add();
    System.out.println("Execution completed successfully");
	}

}
