package exercise;

public abstract class ParentAbstract {

	public abstract void add();//Abstract method we declare once we have a abstract class.
	//we have used inheritance to call method of abstract class.
	public void print() {
		System.out.println("Hi! I am in abstract class");
	}
	
	public void additionalprint() {
		System.out.println("Hi! I am a method from abstract class");
	}
}
