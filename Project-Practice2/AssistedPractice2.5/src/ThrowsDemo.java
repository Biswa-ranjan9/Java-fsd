
public class ThrowsDemo {
	static void checkAge(int age) throws ArithmeticException {
	   try{ 
		   if (age < 18) {
			   throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		   }
		   else {
			   System.out.println("Access granted - You are old enough!");
		   }
	   }catch(ArithmeticException e){
		   System.out.println("\n\tError : " + e.getMessage());;
	   }
	}

	  public static void main(String[] args) {
	    checkAge(19); 
	  }


}
