package Thread;

/*
 * �����̷߳�ʽһ
 * 1.�������̳�Tread�࣬��дrun()������
 * 2.�Ƽ�����������������Ŀ���� implements Runnable;��дrun()������
 */
public class MyThread extends Thread {
	/*
	 * run()�������̵߳����,�൱��main������
	 */
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("�߳�һ��");
			// �߳�ִ�еĴ��롣
		}

	}

	public static void main(String args[]) {
		new MyThread().run();// ע�⣡����ֻ����ͨ�������ã�û�п����̡߳�
		/*
		 * �����̶߳���
		 */
		MyThread s = new MyThread();
		/*
		 * start()�����߳�,���뵽�������С�������֤���̵߳ĳ����������У�������cpu�����������ĸ��̣߳�
		 */
		s.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("���̡߳�");
		}
	}
}

