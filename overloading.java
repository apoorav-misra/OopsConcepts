class overloading { 
	 public int sum(int x, float y) 
	    { 
	        return (int) (x + y); 
	    } 
	 	
	 	public int sum(float x, int y) {
	 		return (int) (x+y);
	 	}
	 
	    // Overloaded sum(). This sum takes three int parameters 
	    public int sum(int x, int y, int z) 
	    { 
	        return (x + y + z); 
	    } 
	  
	    // Overloaded sum(). This sum takes two double parameters 
	    public double sum(double x, double y) 
	    { 
	        return (x + y); 
	    } 
	  
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	    	overloading s = new overloading(); 
	        System.out.println(s.sum(10, 20.0)); //if we use both integers as argument it will throw an error that it is ambigous  
	        System.out.println(s.sum(10, 20, 30)); 
	        System.out.println(s.sum(10.5, 20.5)); 
	    } 
} 
