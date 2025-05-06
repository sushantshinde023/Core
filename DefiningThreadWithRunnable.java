class MyThread implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println("Run method");
		}
	}
}
public class DefiningThreadWithRunnable{
	public static void main(String[] args) {
		MyThread m1=new MyThread();
		Thread t=new Thread(m1);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
		
	}
}