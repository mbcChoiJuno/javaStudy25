package ch01;

//ĳ���� �׽�Ʈ (����ȯ)
public class CastingExam {

	public static void main(String[] args) {
		
		doCasting();
	}

	public static void doCasting() {

		int intValue = 123456789;
		byte byteValue = (byte) intValue; // int to byte

		System.out.println(String.format("int Ÿ�� �� ��� : %d", intValue)); // byte to int 1
		System.out.println(String.format("byte Ÿ�� �� ��� : %d", byteValue)); // byte to int 2

//		0111 0101 1011 1100 1101 0001 0101
//													 0001 0101 -> 21

		int kor = 85;
		int eng = 99;
		int mat = 97;

		int total = kor + eng + mat;
		System.out.println("=========����ǥ============");
		System.out.println(String.format("����+����+���� ���� = %d", total));

		double avg = total / 3;
		System.out.println(String.format("��� ���� : %f", avg));

		float fAvg = total / 3f;
		System.out.println(String.format("��� ����(f) : %f", fAvg));

		double dAvg = (double) total / 3;
		System.out.println(String.format("��� ����(d) : %f", dAvg));
	}
}

//���� ���
//int Ÿ�� �� ��� : 123456789
//byte Ÿ�� �� ��� : 21
//=========����ǥ============
//����+����+���� ���� = 281
//��� ���� : 93.000000
//��� ����(f) : 93.666664
//��� ����(d) : 93.666667
