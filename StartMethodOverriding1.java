class MyThread extends Thread{
	public void start(){
		super.start();//in overridden start method case if we add super.start() it will call thread class start method and so run method also gets executes
		System.out.println("Overridden start method");
	}
	public void run(){
		System.out.println("Run method");
	}
}
public class StartMethodOverriding1{
	public static void main(String[] args) {
		MyThread t=new MyThread();//Main thread executes this line
		t.start();//Main thread starts child thread
		for(int i=0;i<10;i++){
			System.out.println("Main Thread");
		}
		
	}
}