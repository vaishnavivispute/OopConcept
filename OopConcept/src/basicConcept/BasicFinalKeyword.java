package basicConcept;

public class BasicFinalKeyword {
	
	/* Once any entity(variable, method, class)is declared final, it can be assigned only once
	 the final variable can not be changed with other value
	 the final method isn't overridden
	 The final class can not be extended*/
	final int AGE = 32;

	public static void main(String[] args) {
		
    //Rule 1:Creating a final variable and changing it
	// create final variable
	//AGE = 45;//Try to change the final variable but won't be possible.
	}
	
	//Rule 2: Creating final method and overriding it.
		public class FinalDemoBase {
			//Create final method
			public final void display() {
				System.out.println("I am in display method");
			}
		}
		public class FinalDemoChild extends FinalDemoBase{
			//public final void display() //Try to overridden a method but its not possible
			{
				
			}
		}
    //Rule 3: Creating a final class and try to inherit it.
     public final class FinalClass{
    	 public void display() {
    		 
    	 }
     }	 
    	 //Try to extend the final class but its won't allows
    	// public class FinalBase extends FinalClass
    	 {
    		 //public final void display() {
    			 
    		 }
    	 }
	 
		
	


