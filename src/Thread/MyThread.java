package Thread;

/*
 * 创建线程方式一
 * 1.创建：继承Tread类，重写run()方法；
 * 2.推荐方法，创建：创建目标类 implements Runnable;重写run()方法；
 */
public class MyThread extends Thread {
	/*
	 * run()方法是线程的入口,相当于main方法；
	 */
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("线程一·");
			// 线程执行的代码。
		}

	}

	public static void main(String args[]) {
		new MyThread().run();// 注意！！这只是普通方法调用，没有开启线程。
		/*
		 * 创建线程对象
		 */
		MyThread s = new MyThread();
		/*
		 * start()启动线程,加入到调度器中。但不保证该线程的程序立刻运行，而是由cpu决定先运行哪个线程；
		 */
		s.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("主线程·");
		}
	}
}

