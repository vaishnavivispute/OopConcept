package accessModifierTwo;

import accessModifierOne.DefaultModifierone;//Using import keyword we are able to access a class from different packages.

public class DefaultModifierTwo extends DefaultModifierone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultModifierone dmo = new DefaultModifierone();
		//dmo.display(); //Call the method of default access specifier
		//We are calling the display method from the different package set as default, don't allow to access outside the package.
		//But in same class we are able to access but outside the class, packages it don't' allowed.
		

	}

}
