package basicConcept;

//Interface class does not having definition its only declaration, its also used in real time.
//Implements keyword:Form a relation between normal class and interface
//Extends keyword is used access property of one to another class.
//When we use implements keyword then we are able to do the definition its optional.
/*Interface class does not allowed normal method its used only method declaration*/
/*interface methods are not allowed in abstract class*/

public class BasicInter1 implements BasicInterface {

	@Override
	public void hello() {
		System.out.println("Hello!");
		
	}

	@Override
	public void bye() {
		System.out.println("Bye!");
	}
	
	public void intro()//It having normal method also 
	{
		System.out.println("I am vaishnavi!");
	}
	
	public static void main(String args[]) {
		BasicInter1 bi = new BasicInter1();
		bi.hello();
		bi.bye();
		bi.intro();
		
		
	}

}
