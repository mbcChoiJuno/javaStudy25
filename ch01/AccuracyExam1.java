package ch01;

// float, double�� ���� ��� �� 
// �ε� �Ҽ��� ������ �ڿ� ���� �����ϰ� �Ǿ� ��Ȯ�ϰ� ������ �ʴ´�.
public class AccuracyExam1 {

	public static void main(String[] args) {

		int apple = 1;
		double piecePer = 0.1f;

		int piece = 7;

		double result = apple - (piece * piecePer);

		System.out.println(String.format("���� ��� : %f ����", result));
	}

}

//���� ���
//���� ��� : 0.300000 ����