package Runnable;

/*
 * 两人比赛跑步
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
				System.out.println(winner + "获胜！");
				t=true;
			}
			if(t)break;
		}
	}

	public static void main(String args[]) {
		MyRunnable1 s = new MyRunnable1();
		new Thread(s, "小明").start();
		
		/*
		 * 因两个Thread对象都是用同一个MyRunnable的对象s去调用Thread()构造器创建的。所以，他们公用数据：winner,step和t
		 */

	}
}
