package accessModifierTwo;
//If modifier is public so it is accessible anywhere, outside, inside and within packages.
import accessModifierOne.PublicModifierOne;
/*Import used:To form a relation between two classes or packages we need to use import keyword.
Here we import class because we need to create object so that!*/

public class PublicModifierTwo //Here is don't need to extend it because its public.
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicModifierOne pub = new PublicModifierOne();//Create object for base class!
		pub.display();
		
	}

}
