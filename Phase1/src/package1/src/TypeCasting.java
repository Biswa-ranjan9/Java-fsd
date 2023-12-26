package package1.src;

public class TypeCasting {

	public static void main(String[] args) {
		
		//Implicit type casting
		int a=5;
		double b=a;//Implicit type casting from int to double
		System.out.println("Implicit Type Casting:" +b);
		
		//Explicit type casting
		double p=5.9;
		int q=(int)p; //Explicit type casting double to int
		System.out.println("Explicit Type Casting:" +q);

	}

}
