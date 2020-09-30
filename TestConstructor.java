
public class TestConstructor {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		ConstructorChild cc = new ConstructorChild();    // Call the basic child class constructor
														// By default a super keyword will be present to call parent class constructor	
		ConstructorChild cc1 = new ConstructorChild(5);  // This will call the overloaded constructor in the child class
		// By default it will call base parent class constructor. However, if we use super keyword with argument it will call the parent class overloaded constructor
		Constructor c = new ConstructorChild();
		// Here it will act same as in the first case.
	}

}
