package Thread;

/*
 * 2.�Ƽ�����������������Ŀ���� implements Runnable;��дrun()������
 * ����ʹ��Runnable����ʵ�ֹ�����Դ�����ⵥ�̳о����ԣ�����ʹ�ýӿڣ�
 */
public class Mythread1 implements Runnable {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("�̶߳���");
			// �߳�ִ�еĴ��롣
		}
	}

	public static void main(String args[]) {

		// 0�����̶߳���
		Mythread1 s = new Mythread1();
		//1�����������
		Thread r = new Thread(s);		
		 // r.start()�����߳�,���뵽�������С�������֤���̵߳ĳ����������У�������cpu�����������ĸ��̣߳�		
		r.start();
		new MyThread().start();
		/*
		 * ������дΪnew Thread(new Mythread()).start;
		 */
		for (int i = 0; i < 50; i++) {
			System.out.println("���̡߳�");
		}
	}
}
