package accessModifierOne;
//Access modifier: based on the AM we can access and restricted the uses of the class.
//Default, public, private and protected
public class DefaultModifierone {

     void display()//If there is not specific anything its default and we should not write anything   
     {
    	 System.out.println("Hey! Everyone! I am in defalut access Modifier!");
     }



public static void main(String[] args) {
	// TODO Auto-generated method stub
	DefaultModifierone dmo = new DefaultModifierone();
	dmo.display();
	// Same class we are able to access default access specifier but different package and class won't be allowed.

	

}
}
