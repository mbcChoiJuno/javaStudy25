package ch01;

// ����� �׽�Ʈ
public class CompareExam {

	public static void main(String[] args) {
		
		doCompare();
	}

	private static void doCompare() {

		// ���� �񱳿�, ũ�� ��
		// == ����
		// != �ٸ�
		// >, >= �ʰ�, �̻�
		// <, == �̸�, ����

		int num1 = 10;
		int num2 = 10;
		boolean isTrue = (num1 <= num2);
		System.out.println(isTrue);

		char C1 = 'A'; // 65
		char c1 = 'a'; // 97
		char C2 = 'B'; // 66
		isTrue = (C1 == c1);
		System.out.println(isTrue);

		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);

		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v4 == v5);
		System.out.println((float) v4 == v5);
		System.out.println(v4 == (double) v5);
		System.out.println((int) v4 * 10 == (int) v5 * 10);

		// �Ǽ���(�Ҽ���)�� �ε� �Ҽ��� ������ �����ؼ� �ٻ簪���� ǥ��

//		// jo
//		float eee = 10 / 3f;
//		System.out.println(eee);
//		System.out.println(eee == 10 / 3f);

	}

}

//������
//true
//false
//true
//0.1
//0.1
//false
//true
//false
//true