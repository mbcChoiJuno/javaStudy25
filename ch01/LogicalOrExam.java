package ch01;

import java.util.Scanner;

// ���� �׽�Ʈ��
public class LogicalOrExam {

	public static void main(String[] args) {

		// Ű����� �Է¹��� ���ڰ� 2�� ����̰ų� 3�� ����� ���� ó���غ���.
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("�Է��� ������ 2�� 3�� ������� Ȯ���մϴ�. >>> ");
			
			int num = input.nextInt();
			
			if ((num % 2 == 0) || (num % 3 == 0)) {
				
				System.out.printf("%d : %d�� ����Դϴ�.\n", num, ((num % 2 == 0) ? 2 : 3));
				
			} else {
				
				System.out.printf("%d : 2�� 3�� ����� �ƴմϴ�.\n", num);
				
			}
		}
	}
}

//������
//�Է��� ������ 2�� 3�� ������� Ȯ���մϴ�. >>> 3
//3 : 3�� ����Դϴ�.
//�Է��� ������ 2�� 3�� ������� Ȯ���մϴ�. >>> 2
//2 : 2�� ����Դϴ�.
//�Է��� ������ 2�� 3�� ������� Ȯ���մϴ�. >>> 7
//7 : 2�� 3�� ����� �ƴմϴ�.
