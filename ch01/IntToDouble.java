package ch01;

//ĳ���� �׽�Ʈ (����ȯ)
public class IntToDouble {

	public static void main(String[] args) {

		doCasting();
	}

	public static void doCasting() {

		int num1 = 123456780;
		int num2 = 123456780;

		double num3 = num2;
		num2 = (int) num3;

		System.out.println("num 1 : " + num1);
		System.out.println("num 2 : " + num2);
		System.out.println("num 3 : " + num3);

		System.out.println(String.format(("num1 : %d"), num1));
		System.out.println(String.format(("num2 : %d"), num2));
		System.out.println(String.format(("num3 : %f"), num3));

		int result = num1 - num2;
		System.out.println("double ���� �ٳ�� �Ŀ� num2 �� ���� �ȵ�");
		System.out.println("num1 - num2 : " + result);
	}
}

//������
//num 1 : 123456780
//num 2 : 123456780
//num 3 : 1.2345678E8
//num1 : 123456780
//num2 : 123456780
//num3 : 123456780.000000
//double ���� �ٳ�� �Ŀ� num2 �� ���� �ȵ�
//num1 - num2 : 0