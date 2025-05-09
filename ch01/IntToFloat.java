package ch01;

//ĳ���� �׽�Ʈ (����ȯ)
public class IntToFloat {

	public static void main(String[] args) {
		
		doCasting();
	}
	
	public static void doCasting() {
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		System.out.println("num1 : " + num1); // num1 : 123456780
		System.out.println("num2 : " + num2); // num2 : 123456784
		System.out.println("num3 : " + num3); // num3 : 1.23456784E8
		
		System.out.println(String.format(("num1 : %d"), num1));
		System.out.println(String.format(("num2 : %d"), num2));
		System.out.println(String.format(("num3 : %f"), num3));

		int result = num1 - num2;
		System.out.println("float ���� �ٳ�� �Ŀ� num2 �� �����"); // 
		System.out.println("num1 - num2 : " + result); // 
	}
}

//������
//num1 : 123456780
//num2 : 123456784
//num3 : 1.23456784E8
//num1 : 123456780
//num2 : 123456784
//num3 : 123456784.000000
//float ���� �ٳ�� �Ŀ� num2 �� �����
//num1 - num2 : -4
