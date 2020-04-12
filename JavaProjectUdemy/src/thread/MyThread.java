package thread;

class Hi extends Thread{
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

class Hello  extends Thread{
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
public class MyThread {

	public static void main(String[] args) throws InterruptedException {
		Hi hi = new Hi();
		Hello hello = new Hello();
		
		hi.start();
		Thread.sleep(10);
		hello.start();
	}

}
