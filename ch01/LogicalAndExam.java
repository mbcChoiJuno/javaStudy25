package ch01;

import java.util.Scanner;

// ���� �׽�Ʈ��
public class LogicalAndExam {

	public static void main(String[] args) {

		//jo
		//doConvertASCII();

		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��Ͻø� �� �ҹ��ڳ� ���ڸ� �Ǵ��� �帱�Կ�");
		System.out.println("�����ڵ� ǥ�� �����Ͽ� ���α׷��� �����Ͽ����ϴ�.");
		System.out.print("���� �Է� >> ");
		
		int charCode = input.nextInt();
		
		if ((90 >= charCode) && (charCode >= 65)) { // �빮��
			
			System.out.println("���� �Էµ� ���ڴ� �빮�� �Դϴ�. : " + (char)charCode);
			
		} else if ((122 >= charCode) && (charCode >= 97)) {
			
			System.out.println("���� �Էµ� ���ڴ� �ҹ��� �Դϴ�. : " + (char)charCode);
			
		} else if (!( (57 > charCode) && (charCode > 48) )) {
//		} else if (!(57 > charCode) && !(charCode > 48)) {
			
			System.out.println("���� �Էµ� ���ڴ� �����ڵ��� ������ ���� �Դϴ�. : " + (char)charCode);
			
		} else {
			
			System.out.println("�빮��, �ҹ���, ������ �����ڵ� ǥ�� ���� �����Դϴ�.");
			System.out.println("���α׷��� �ٽ� ���� ���ּ���");
			
		}
	}

	private static void doConvertASCII() {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {

			String result = "";
			
			System.out.print("\n���ڳ� ���� �Է� >>> ");
			
			String target = input.next();

			// ���� �Ǵ�
			int charCode = 0;

			try {
				charCode = Integer.parseInt(target);			
				// ������
				
				// ���� -> �ƽ�Ű ���ڷ� ��ȯ
				System.out.printf("ASCII ��ȯ >> %d -> '%s'\n", charCode, (char)charCode);
				
			} catch (Exception e) {
				// ���ڰ� �ƴ�
				
				if (target.length() == 1) {
					
					// char -> ���ڷ� ��ȯ
					System.out.printf("ASCII ��ȯ >> '%s' -> %d\n", target, (int)target.charAt(0));
				
				} else {

					System.out.println("**�ѱ��ڸ� �Է�**");
					continue;
					
				}
			}
		}
	}
}

//������

//������ �Է��Ͻø� �� �ҹ��ڳ� ���ڸ� �Ǵ��� �帱�Կ�
//�����ڵ� ǥ�� �����Ͽ� ���α׷��� �����Ͽ����ϴ�.
//���� �Է� >> 65
//���� �Էµ� ���ڴ� �빮�� �Դϴ�. : A

//������ �Է��Ͻø� �� �ҹ��ڳ� ���ڸ� �Ǵ��� �帱�Կ�
//�����ڵ� ǥ�� �����Ͽ� ���α׷��� �����Ͽ����ϴ�.
//���� �Է� >> 97
//���� �Էµ� ���ڴ� �ҹ��� �Դϴ�. : a

//������ �Է��Ͻø� �� �ҹ��ڳ� ���ڸ� �Ǵ��� �帱�Կ�
//�����ڵ� ǥ�� �����Ͽ� ���α׷��� �����Ͽ����ϴ�.
//���� �Է� >> 6
//���� �Էµ� ���ڴ� �����ڵ��� ������ ���� �Դϴ�. : 