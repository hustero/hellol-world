package Runnable;

/*
 * ���˱����ܲ�
 */
public class MyRunnable1 implements Runnable {
	private String winner;
	private int step = 0;
	boolean t = false;

	public void run() {
		for (step = 1; step <= 100; step++) {
			System.out.println(Thread.currentThread().getName() + "-->" + step);
			step++;
			if (step == 100) {
				winner = Thread.currentThread().getName();
				System.out.println(winner + "��ʤ��");
				t=true;
			}
			if(t)break;
		}
	}

	public static void main(String args[]) {
		MyRunnable1 s = new MyRunnable1();
		new Thread(s, "С��").start();
		new Thread(s, "С��").start();
		/*
		 * ������Thread��������ͬһ��MyRunnable�Ķ���sȥ����Thread()�����������ġ����ԣ����ǹ������ݣ�winner,step��t
		 */

	}
}
