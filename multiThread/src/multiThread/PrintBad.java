package multiThread;

class PrintGood extends Thread{

	@Override
	public void run() {
	 for(int i=0;i<7;i++) {
		 System.out.println(" good ");
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
		
	}
	
	
	
}


public class PrintBad extends Thread {

	@Override
	public void run() {
		 for(int i=0;i<7;i++) {
			 System.out.println(" bad ");
			 try {
				 Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
		 }
		
	}
	
	public static void main(String[]args) throws Exception {
		
		PrintGood t1= new PrintGood();
		PrintBad  t2= new PrintBad();
		
		t1.start();
		t2.start();
		Thread.sleep(1000);
		System.out.println(" good bad");
		
	}


}
