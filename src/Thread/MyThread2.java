package Thread;

public class MyThread2 {
	static int n = 5;

	public static void main(String args[]) {
		/*
		 * currentThread()��������һ����ǰ���̵����ã����ﷵ�����߳�main�����ã�
		 */
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		t.setName("����");
		System.out.println(t.getName());
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {//Thread.sleep()��ʱ�����ܳ���InterruptedException�쳣��
				System.out.println("���̱߳���ϣ�");
			}
			System.out.println("���ǵ�" + i + "��ѭ��");
		}
	}
}
