
public class MyRunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("welcome 2024");
	}
	
	public static void main(String[] args) {
		
		MyRunnableThread a=new MyRunnableThread();
		Thread t= new Thread(a);
		t.start();
		System.out.println("By by 2023");
	}
	
	

}
