package thread;

public class Thread_Lamda {

	public static void main(String[] args) throws InterruptedException {
		/*Hi1 hi = new Hi1();
		Hello1 hello = new Hello1();
		*/
		Runnable r1 = ()->{
				for(int i=1;i<=5;i++){
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		};
		Runnable r2 = ()-> {
				for(int i=1;i<=5;i++){
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		System.out.println(t1.getName());
		t1.setName("Thread-1");
		System.out.println(t1.getName());
		System.out.println("ppriorirt"+t1.getPriority());
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("max ppriorirt"+t1.getPriority());
		
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		
		System.out.println(t1.isAlive());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("Byeeee");
	}

}
