package Thread;

/*
 * 2.推荐方法，创建：创建目标类 implements Runnable;重写run()方法；
 * 优先使用Runnable，可实现共享资源、避免单继承局限性，优先使用接口；
 */
public class Mythread1 implements Runnable {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("线程二·");
			// 线程执行的代码。
		}
	}

	public static void main(String args[]) {

		// 0创建线程对象
		Mythread1 s = new Mythread1();
		//1创建代理对象
		Thread r = new Thread(s);		
		 // r.start()启动线程,加入到调度器中。但不保证该线程的程序立刻运行，而是由cpu决定先运行哪个线程；		
		r.start();
		new MyThread().start();
		/*
		 * 可以缩写为new Thread(new Mythread()).start;
		 */
		for (int i = 0; i < 50; i++) {
			System.out.println("主线程·");
		}
	}
}
