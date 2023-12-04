package exceptionHandling;

public class TryCatchException {
	
	/* Without try, catch block once exception occur program execution will stop /*
	 * With try, catch block once exception occur program execution won't stop
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int d =  5 / 0 ;
			System.out.println(d);
		}
      catch (Exception e) {
    	  System.out.println("I'm catch block");
    	  e.printStackTrace();
      }
	}

}
