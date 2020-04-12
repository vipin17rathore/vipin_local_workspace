package thread;

class Counter{
	int count;
	public synchronized void th_count(){
		count++;
	}
	
	}

public class Synchronised_Thread {

	public static void main(String[] args) throws Exception {
		Counter counter = new Counter();
		
		Thread t1 = new Thread(new Runnable()
				{
					public void run() {
						for(int i=0;i<1000;i++){
							counter.th_count();
						}
					}
				});
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run() {
				for(int i=0;i<1000;i++){
					counter.th_count();
				}
			}
		});
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		/*t2.join();
		*/
		System.out.println("count is::"+counter.count);
		
	}

}
