package basicConcept;

public class TutoStaticKeyword {
	static int a = 10;
	static int b = 100;
	int c = 20;
	
	public void add() //Non- static method 
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
    public static void multiply() {
    	int mul = a*b;
    	System.out.println(mul);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TutoStaticKeyword ts = new TutoStaticKeyword();
		System.out.println(a);//accessing static variable
		 ts.add();//call add method using object
		 multiply(); //Approach 1 to call static method without creating object
		 TutoStaticKeyword.multiply();//Approach 2 to call static method without creating object
		 System.out.println("Job done");

	}

}
