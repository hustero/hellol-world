package Runnable;

class MyRunnable2 implements Runnable {
	int count;
	Thread thrd;

	MyRunnable2(String name) {
		thrd = new Thread(this, name);
		count = 0;
		thrd.start();
	}

	public void run() {
		System.out.println(thrd.getName() + "线程开始");
		try {
			do {
				Thread.sleep(500);
				System.out.println("在" + thrd.getName() + ",计数到" + count);
				count++;
			} while (count < 5);
		} catch (InterruptedException e) {
			System.out.println(thrd.getName() + "被打断。");
		}
	}

	public static void main(String[] args) {
		System.out.println("线程开始");
		MyRunnable2 m1 = new MyRunnable2("线程一");
		MyRunnable2 m2 = new MyRunnable2("线程二");
		MyRunnable2 m3 = new MyRunnable2("线程三");
		do {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("主线程被打断。");
			}
		} while (m1.count < 5 && m2.count < 5 && m3.count < 5);
		System.out.println("主线程结束。");
	}
}

