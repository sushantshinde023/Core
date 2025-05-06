class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
		System.out.println("Child Thread");
		}
		
	}
}
public class ThreadDemoByExtendingThread{
	public static void main(String[] args) {
		MyThread t=new MyThread();//Main thread executes this line
		t.start();//Main thread starts child thread
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
		
	}
}