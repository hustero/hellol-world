package Thread;

/*
 * 优点：
 * 1.实现资源共享，并发（线程安全）
 */
public class MyRunnable0 implements Runnable {
	int n=99;
	public void run() {
        while(n>=0)
        {
        	System.out.println(Thread.currentThread().getName()+"-->"+n);n--;
        }
	}
	public static void main(String args[]) {
		MyRunnable0 e=new MyRunnable0();
		new Thread(e,"小米").start();
		new Thread(e,"噢").start();
		new Thread(e,"哇").start();//三条线程；
	}
}
