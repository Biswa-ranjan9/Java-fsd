package package2.src;

import package1.src.A;

public class D {
	public void mB() {
		A a = new A();

		a.x1 = 23;

		
		// default cannot be accessed in other package classes
		//a.x2 = 23;
		
		
		// protected cannot be accessed in other package classes
		// a.x3 = 55;
		
		
		// private cannot be accessed in other classes
		// a.x4=23;
		

	}


}
