package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {

	public static void main(String[] args) {
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println("coreCount"+coreCount);
		ExecutorService service =  Executors.newFixedThreadPool(coreCount);
		for(int i=0;i<15;i++) {
			service.execute(new thread1());
			
		}
	}

}
class thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("run method");
	}
	
}