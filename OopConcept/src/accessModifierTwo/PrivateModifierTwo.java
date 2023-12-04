package accessModifierTwo;

import accessModifierOne.PrivateModifierOne;
//Private modifier won't be accessed in outside the class.
public class PrivateModifierTwo {
	
	

	public static void main(String[] args) {
		PrivateModifierOne pr = new PrivateModifierOne();
		pr.project();
		//pr.display();//We are calling display method of another class but don't allowed.
	}

}
