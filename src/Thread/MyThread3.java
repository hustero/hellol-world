package Thread;

public class MyThread3 extends Thread{
	int count;
	String name;
	int time;
	public MyThread3(int timee,String namee) {
		time=timee;
		name=namee;count=0;
	}
public void run() {
	while(true) {
		try {
			System.out.println("���֣�"+name+".");
			Thread.sleep(time);
		}catch(Exception e) {e.printStackTrace();}
		if(count++>3)break;
	}
}
public static void main(String args[]) {
	new MyThread3(1000,"С��").start();
	new MyThread3(2000,"С��").start();
	
}
}
