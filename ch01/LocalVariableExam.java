package ch01;

// �������� �׽�Ʈ
public class LocalVariableExam {

	public static void main(String[] args) {

		// ������ ��� ������ ��ȣ(��) �ȿ��� ȿ���� ������
		
		int v1 = 15;
		int v2 = 0; // ���� ������ ������ �� �Ұ�!!!
		
		if (v1 > 10) { // if �� �񱳹����� ��ȣ���� ���̸� ���� �����Ѵ�.
//			int v2 = v1 + 10;
			v2 = v1 + 10;
		}

		int v3 = v1 + v2 + 5;
		
		System.out.println("v1�� ��:"+v1);
		System.out.println("v2�� ��:"+v2);
		System.out.println("v3�� ��:"+v3);
	}

}

//������
//v1�� ��:15
//v2�� ��:25
//v3�� ��:45