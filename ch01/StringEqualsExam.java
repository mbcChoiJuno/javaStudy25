package ch01;

// ���ڿ� �� �׽�Ʈ
public class StringEqualsExam {

	public static void main(String[] args) {

		doEquals();
	}

	private static void doEquals() {

		String strval1 = "���ؿ�";
		String strval2 = "���ؿ�";
		String strval3 = new String("���ؿ�");

		System.out.println(strval1 == strval2);
		System.out.println(strval1.toString());
		System.out.println(strval3.toString());
		System.out.println(strval1.toString() == strval3.toString());

		// ��ü�� �� �񱳸� ���ؼ��� ���� �޼��� ���
		boolean eq1 = strval1.equals(strval3);
		System.out.println("String�� equals �޼��� ��� ���: " + eq1);

		// jo
		System.out.println(strval1.equals(strval3));
	}

}

//������
//true
//���ؿ�
//���ؿ�
//false
//String�� equals �޼��� ��� ���: true
//true