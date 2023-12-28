
interface b 
{
  default void sum()
  {
    System.out.println("Hello this is interface b");
  }
}
interface c 
{
  default void sum()
  {
    System.out.println("Hello this is interface c");
  }
}
class TestClass implements b,c
{
  
  public static void main(String args[])
  {
	  TestClass obj=new TestClass();
    obj.sum();
  }

@Override
public void sum() {
	b.super.sum();
	c.super.sum();
	
}

}
