package ch01;

// ���� ���� ����
public class VarExam {

	public static void main(String[] args) {
		
		// �������� �׽�Ʈ
		int x = 1; // ����Ÿ�� x ������ 1���� �ִ´�.
		
		char y = 65; // char�� ����Ÿ���ε� ���ڷ� ��ȯ��
					// ��ǻ�ʹ� ���ڸ� �����ڵ�� ��ȯ�ؼ� ó����
					// �����ڵ� ǥ�� 65�� A
		
		char z = 'A'; // char Ÿ���� z ������ ���� A�� ����
		
		System.out.println("int x = "+x);
		System.out.println("char y = "+y);
		System.out.println("char z = "+z);
		
		
		char z1 = 'b';
		
		// ������ ����
		int x1; // �ʱ�ȭ �ȵ� ����
		x1 = 10;
		System.out.println(x1);
		
		// ���� ���� ����
		int kor, mat, eng, total, avg;
		
		kor = 90;
		mat = 80;
		eng = 70;
		total = kor + mat + eng;
		avg = total / 3;
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + avg);
		
		// ���� �ۼ� ��Ģ
		// ù���� ����, $, _ �� ����
		// ������ũ ǥ���
		
		int price, $price, _price; // ������ Ư������ ��� ����

//		int 1v;
//		int @speed;
//		int $#value;
		
		char firstname = '��';
		char firstName = '��';

		System.out.println("�� : " + firstname);
		System.out.println("�� : " + firstName);
		// ������ ��ҹ��ڴ� �ٸ� ������ �ν��Ѵ�.
		
		// ������ ������ ����� �� ����.
		// ������ �ڹٿ��� �̹� ������� ���� (����, Ŭ����)
		// int char;
		
		
		// ���ͷ� : ���� �Էµ� ��
		int literal1 = 75; 	// 10����
		int literal2 = 075;	// 8����
		int literal3 = 0b0011;	// 2����
		int literal4 = 0xA;	// 16����
		
		System.out.println("10���� 75 :" + literal1);
		System.out.println("8���� 75 :" + literal2);
		System.out.println("2���� 0011 :" + literal3);
		System.out.println("16���� A :" + literal4);
		
	}

}

//������
//int x = 1
//char y = A
//char z = A
//10
//���� : 240
//��� : 80
//�� : ��
//�� : ��
//10���� 75 :75
//8���� 75 :61
//2���� 0011 :3
//16���� A :10