package basicConcept;

public class BasicAbstract1 extends BasicAbstract {

	/*Main purpose of creating abstract class is to use abstract method*/
	/* If you inherit an abstract class, you have to provide definition*/
	/*Abstract method should be public if it needs to be inheritance*/
	/*Final keyword can not be used with Abstract class*/
	
	public static void main(String[] args) {
		BasicAbstract1 bc= new BasicAbstract1();
		bc.add();
		bc.multiply();
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}
	public void add() {
		int a = 10, b = 20;
		int c = a + b;
		System.out.println(c);
	}

}
