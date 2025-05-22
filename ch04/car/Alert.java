package ch04.car;

/**
 * Car 클래스 수업
 * 
 * @author 10-2
 *
 */
public class Alert {

	/**
	 * Console에 알림창 표시
	 * @param msg
	 * @param time
	 */
	public static void print(String msg, int time) {

		System.out.printf("\n");
		System.out.printf("%s\n", msg);
		wait(time);
	}
	
	/**
	 * Console 대기 시키기
	 * @param time
	 */
	public static void wait(int time) {
		try {
			Thread.sleep(time * 1000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
