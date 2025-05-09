package ch01;

// ���θ�� �׽�Ʈ (����ȯ)
public class PromotionExam {

	public static void main(String[] args) {

		// ���� Ÿ�� >> ū Ÿ��
		// byte(1) short(2) int(4) float(4) long(8) double(8)

		doPromotion();
	}
	
	public static void doPromotion() {

		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println(String.format("�ڵ�Ÿ�� ������ int : %d", intValue)); // byte to int
	
		char charValue = '��';
		intValue = charValue;
		System.out.println(String.format("�ڵ�Ÿ�� ������ int : %d", intValue)); // char to int
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(String.format("�ڵ�Ÿ�� ������ long : %d", longValue)); // int to long
		
		double doubleValue = intValue;
		System.out.println(String.format("�ڵ�Ÿ�� ������ double : %01.01f", doubleValue)); // int to double
		System.out.println("�ڵ�Ÿ�� ������ double : " + doubleValue); // int to double
		
	}

}

//������
//�ڵ�Ÿ�� ������ int : 10
//�ڵ�Ÿ�� ������ int : 44032
//�ڵ�Ÿ�� ������ long : 500
//�ڵ�Ÿ�� ������ double : 500.0
//�ڵ�Ÿ�� ������ double : 500.0