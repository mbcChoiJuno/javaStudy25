package ch01;

import java.util.Scanner;

// Scanner ��ü �׽�Ʈ
// ���� �����ڷ� Ȧ¦ ����
public class Exam2 {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� >>> ");
		
		int num = scan.nextInt();
		
		System.out.println( (num % 2 == 0) ? "¦��" : "Ȧ��");

	}

}

//������
//������ �Է��ϼ��� >>> 1
//Ȧ��

//������ �Է��ϼ��� >>> 2
//¦��