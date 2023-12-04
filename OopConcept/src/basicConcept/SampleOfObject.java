package basicConcept;

public class SampleOfObject {

	int a = 10;
	int b = 20;
	int c;
	
	public void add() {
		int c = a+b;
		System.out.println(c);
		
	}
	
	
	
	
	public static void main(String[] args) {
	SampleOfObject ob = new SampleOfObject();
	ob.add();
	System.out.println("Job done");

	}

}
