package Thread;

public class MyThread2 {
	static int n = 5;

	public static void main(String args[]) {
		/*
		 * currentThread()方法返回一个当前进程的引用；这里返回主线程main的引用；
		 */
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		t.setName("改名");
		System.out.println(t.getName());
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {//Thread.sleep()延时，可能出现InterruptedException异常。
				System.out.println("主线程被打断！");
			}
			System.out.println("这是第" + i + "次循环");
		}
	}
}
