
public class Polymorphism {
	 public int add(int a, int b) {
         return a + b;
     }

     public double add(double a, double b) {
         return a + b;
     }

     public int add(int a, int b, int c) {
         return a + b + c;
     }
 
     public static void main(String[] args) {
         Polymorphism math = new Polymorphism();
         int sum1 = math.add(2, 3);                
         double sum2 = math.add(2.5, 3.5);         
         int sum3 = math.add(2, 3, 4);          
       
         System.out.println(sum1);    
         System.out.println(sum2);    
         System.out.println(sum3);    
     }

}
