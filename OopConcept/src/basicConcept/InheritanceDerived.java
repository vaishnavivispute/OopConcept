package basicConcept;

public class InheritanceDerived extends InheritanceBase1 {
 
	public void mul() {
	  c = a * b; //Accessing global variable
	  System.out.println("Multiplication of two no is:"+c);
	}
	
	public void div() {
		c = b /a;
		  System.out.println("Division of two no is:"+c);
	}
	
	
	
	
	public static void main(String[] args) {
		InheritanceDerived d = new InheritanceDerived();//Create object
		d.add();//Calling base class methods.
		d.sub();
		d.mul();
		d.div();

	}
}
