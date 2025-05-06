class MyThread extends Thread{
	public void start(){
		System.out.println("Overridden start method");
	}
	public void run(){
		System.out.println("Run method");
	}
}
public class StartMethodOverriding{
	public static void main(String[] args) {
		MyThread t=new MyThread();//Main thread executes this line
		t.start();//Main thread starts child thread
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
		
	}
}