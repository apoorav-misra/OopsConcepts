// Java program to illustrate Constructor Chaining to 
// other class using super() keyword 
class Constructor 
{ 
	String name; 

	// constructor 1 
	Constructor() 
	{ 
		this(""); 
		System.out.println("No-argument constructor of" + 
										" base class"); 
	} 

	// constructor 2 
	Constructor(String name) 
	{ 
		this.name = name; 
		System.out.println("Calling parameterized constructor"
											+ " of base"); 
	} 
} 

class Derived extends Constructor 
{ 
	// constructor 3 
	Derived() 
	{ 
		System.out.println("No-argument constructor " + 
						"of derived"); 
	} 

	// parameterized constructor 4 
	Derived(String name) 
	{ 
		// invokes base class constructor 2 
		super(name); 
		System.out.println("Calling parameterized " + 
						"constructor of derived"); 
	} 

	public static void main(String args[]) 
	{ 
		// calls parameterized constructor 4 
		Derived obj = new Derived("test"); 

		// Calls No-argument constructor 
		// Derived obj = new Derived(); 
	} 
} 
