package ch01;

// ��Ȯ�� ����� �ʿ��� �� ��� 

// 1. �������� �̿��� ����Ѵ�.

// 2. BigDecimal�� �̿��Ѵ�. (�������� �ƴ�)

// �������� ���O�� ��Ȯ�� ���
public class AccuracyExam2 {

	public static void main(String[] args) {

		int apple = 1;
		int totalPieces = apple * 10;
		int subPiece = 7;
		int tmp = totalPieces - subPiece;

		float result = tmp / 10.0f;
		System.out.println("���� ��� ���� �� : " + result);
	}

}

//���� ���
//���� ��� ���� �� : 0.3