package thread;

class Hi1 implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
		System.out.println("Hi");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}

class Hello1 implements Runnable{
	public void run(){
		for(int i=1;i<=5;i++){
		System.out.println("Hello");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
}
public class Thread_Runnable {

	public static void main(String[] args) throws InterruptedException {
		/*Hi1 hi = new Hi1();
		Hello1 hello = new Hello1();
		*/
		Runnable r1 = new Hi1();
		Runnable r2 = new Hello1();
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		Thread.sleep(10);
		t2.start();
	}

}
