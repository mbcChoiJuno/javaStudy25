package ch01;

// int형 데이터에 값 범위 초과시 예외처리 연습
public class CheckOverflowExam {

	public static void main(String[] args) {

		int a = -1;
		int b = -2147483648;
		int result = safeAdd(b, a);

		System.out.println(result);
		System.out.flush();
		System.out.println(result);
	}

	public static int safeAdd(int left, int right) {

		if (right > 0) {
			if (left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if ((Integer.MIN_VALUE - right) > left) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}

		return left + right;
	}

	/*
	 * public static boolean isSafe() {
	 * 
	 * 
	 * 
	 * }
	 */

}

//실행 결과

//int 값 범위 초과 시 
//Exception in thread "main" java.lang.ArithmeticException: 오버플로우 발생