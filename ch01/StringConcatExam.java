package ch01;

// ���ڿ� ���� �׽�Ʈ
public class StringConcatExam {

	public static void main(String[] args) {

		doConcat();
	}

	private static void doConcat() {
		
		// print("���ڿ�" + "�Դϴ�.") -> + ���� ������
		
		String str1 = "JDK" + 17.0;
		System.out.println(str1);

		String str2 = str1 + "Ư¡";
		System.out.println(str2);

		String str3 =  "jdk" + 3 + 3.0;
		System.out.println(str3);

		String str4 =  3 + 3.0 + "jdk";
		System.out.println(str4);
		
		// �ڵ� �帧
		// ������ �Ʒ���
		// ���ʿ��� ���������� ��
		
		
		// jo
		StringBuilder sb = new StringBuilder();
		sb.append("���ڿ�");
		sb.append("�Դϴ�.");
		System.out.println(sb.toString());
	}

}

//������
//JDK17.0
//JDK17.0Ư¡
//jdk33.0
//6.0jdk
//���ڿ��Դϴ�.