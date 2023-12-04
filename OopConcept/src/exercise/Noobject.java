package exercise;


public class Noobject {
	
	static int a = 100;
	static int b = 200;
	static int c;
	
	public static void add() {
		int c = a + b;
		System.out.println("Addition of two no is" +c);
		
		}
	
	public static void multiply() {
		int c = a * b;
		System.out.println("Multiplication of two no is" +c);
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();//Approach 1 to call static method without creating object
		multiply();
		Noobject.add();//Approach 2 to call method without creating object 
		System.out.println(Noobject.c);//Call the static variable
		
		

	}

}
