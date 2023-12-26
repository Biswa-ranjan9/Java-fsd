package package1.src;

public class CallingMethod {
	//user-defined static method  
	static void method1()   
	{  
	System.out.println("The static method invoked.");  
	}  
	//user-defined non-static method  
	void method2()   
	{  
	System.out.println("Non-static method invoked.");  
	}  
	public static void main(String[] args)   
	{  
	//calling static method without using the object  
		method1(); //called method  
	//creating an object of the class  
	CallingMethod me=new CallingMethod();  
	//calling non-static method  
	me.method2(); //called method  
	}  

}
