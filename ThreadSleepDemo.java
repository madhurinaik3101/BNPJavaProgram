class ThreadSleepDemo extends Thread{
	public static void main(String[] args) {
		ThreadSleepDemo ref = new ThreadSleepDemo();
		ref.setName("seconds");
		ref.start();	
	}
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName()+"I am going to sleep");
		int i=1;
		try{
			while(i> 0){
			System.out.print(i);
			System.out.print("\r");
			Thread.sleep(1000);
			i++;
		}
		}	
		catch(InterruptedException ie) {
				System.out.println("Dont interrupt");	
		}
		}
			}
	
