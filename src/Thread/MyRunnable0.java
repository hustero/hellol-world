package Thread;

/*
 * �ŵ㣺
 * 1.ʵ����Դ�����������̰߳�ȫ��
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
		new Thread(e,"С��").start();
		new Thread(e,"��").start();
		new Thread(e,"��").start();//�����̣߳�
	}
}
