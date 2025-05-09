package ch01;

// int�� �����Ϳ� �� ���� �ʰ��� ����ó�� ����
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
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		} else {
			if ((Integer.MIN_VALUE - right) > left) {
				throw new ArithmeticException("�����÷ο� �߻�");
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

//���� ���

//int �� ���� �ʰ� �� 
//Exception in thread "main" java.lang.ArithmeticException: �����÷ο� �߻�