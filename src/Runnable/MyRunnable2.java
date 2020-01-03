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
		System.out.println(thrd.getName() + "�߳̿�ʼ");
		try {
			do {
				Thread.sleep(500);
				System.out.println("��" + thrd.getName() + ",������" + count);
				count++;
			} while (count < 5);
		} catch (InterruptedException e) {
			System.out.println(thrd.getName() + "����ϡ�");
		}
	}

	public static void main(String[] args) {
		System.out.println("�߳̿�ʼ");
		MyRunnable2 m1 = new MyRunnable2("�߳�һ");
		MyRunnable2 m2 = new MyRunnable2("�̶߳�");
		MyRunnable2 m3 = new MyRunnable2("�߳���");
		do {
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("���̱߳���ϡ�");
			}
		} while (m1.count < 5 && m2.count < 5 && m3.count < 5);
		System.out.println("���߳̽�����");
	}
}

