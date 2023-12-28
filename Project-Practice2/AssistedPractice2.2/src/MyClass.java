
public class MyClass {
	 private static Object obj = new Object();  
	    public static void main(String[] args)throws InterruptedException   
	    {    
	        Thread.sleep(2000);   
	        System.out.println( Thread.currentThread().getName() + " Thread is work after two second");   
	        synchronized (obj)    
	        {     
	            obj.wait(2000);   
	            System.out.println(obj + " Object is in waiting state and work after 2 seconds");   
	        }   
	    } 

}
