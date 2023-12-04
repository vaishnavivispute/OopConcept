package basicConcept;

public class ConstructorNoArgu {

	public ConstructorNoArgu() //Constructor name is same name as class name.
	//NO ARGUMENT CONSTRUCTOR 
	{
	 int a1 = 30;
	 int b1 = 30;
	 int c1 = a1 + b1;
	 System.out.println(c1);
	 System.out.println("This is no Argument Constuctor");
		
	}
	//Declaring a method to sum 2 numbers
	public void add() {
		int a =10, b=10, c;
		c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		//creating object for a class. During this object creation
		//the constructor will also executed.
		ConstructorNoArgu ct = new ConstructorNoArgu();
	    //Using object calling the class method (add) and printing sysout

		ct.add();
		System.out.println("Job Done!");
		
	}

}
