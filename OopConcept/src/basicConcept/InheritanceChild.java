package basicConcept;
//Build two classes we use extends keywords.
//Extends:having all authority to invoke properties of base class.
public class InheritanceChild extends InheritanceBase{
	
	int e = 1;
	int f = 9;
	int g = e +f;
	
	
	public void derivedclassadd() {
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
	
	
	public void baseclassadd() {
		System.out.println("Hello");
		super.baseclassadd();//access a method of base class so we need to use super keyword
		//Authority 
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceChild c = new InheritanceChild();
		//Using child class object we invoke a base class properties.
		c.baseclassadd();
		c.derivedclassadd();
		System.out.println(c.a);
		System.out.println("Execution is done both base");

	}

}
