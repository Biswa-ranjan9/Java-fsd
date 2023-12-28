
public class FinallyBlockDemo {
	public static void validate(int age) {
		try{
        if(age<18) {   
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        } 
		}catch(ArithmeticException e){
			System.out.println("\n\tError : " + e.getMessage());;
		}finally{
			System.out.println("End of Program");
		}
    }   
    public static void main(String args[]){ 
        validate(13);  
            
  }    

}
