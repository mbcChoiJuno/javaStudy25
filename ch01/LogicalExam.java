package ch01;

import java.util.HashMap;
import java.util.Scanner;

// ���� ������ Ŭ����
class UserData {
	private  String id = "";
	private  String pw = "";
	
	public UserData(String inputId, String inputPw) {
		id = inputId;
		pw = inputPw;
	}
	
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}
}

// ������ �׽�Ʈ
// �α��� ��� ���� ����
public class LogicalExam {

	static HashMap<String, UserData> userTable = new HashMap<String, UserData>();
	static Scanner input; 
	static int scene = 0; // 0 ���� ȭ��, 1 ���� ȭ��, 2 �α��� ȭ��


	// �ܼ� ������
	private static void ClearDisplay() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		
		doLogical();
	}
	
	private static void doLogical() {
		input = new Scanner(System.in); 
		
		// 1. �޴� ǥ��
		MoveMainMenu();
	}
	
	// 1. ���� �޴�
	// ȸ������
	// �α���
	private static void MoveMainMenu() {
		while (true) {
			ClearDisplay();

			System.out.println(" ====== ���� �޴� ====== ");
			System.out.println(" 1. ȸ������ ");
			System.out.println(" 2. �α��� ");
			System.out.println("");
			System.out.print(" �Է� :  ");
			
			String num = input.nextLine();
			
			switch (num) {
			case "1": {
				MoveRegistMenu();
				break;
			}
			case "2": {
				MoveLoginMenu();
				break;
			}
			default:
				continue;
			}
			
			break;
		}
	}
	
	// ȸ������ �޴�
	private static void MoveRegistMenu() {
		while (true) {
			ClearDisplay();

			System.out.println(" ====== ȸ������ �޴� ====== ");
			System.out.print(" ���� �Է� :  ");
			
			String id = input.nextLine();
			
			if (userTable.containsKey(id)) {
				continue;
			}
			else {

				System.out.println("");
				System.out.print(" �н����� �Է� :  ");
				String pw = input.nextLine();
				
				userTable.put(id,new UserData(id, pw));
				
				MoveRegistDoneMenu();
				break;
			}
		}
	}

	// ȸ������ �Ϸ� ȭ��
	private static void MoveRegistDoneMenu() {

		while (true) {
			ClearDisplay();

			System.out.println(" ====== ȸ������ �޴� ====== ");
			System.out.println(" ���� �Ϸ� ");
			System.out.println(" 1. ���ư��� ");

			String num = input.nextLine();

			if (num.equals("1")) {
				MoveMainMenu();
				break;
			}
		}
	}

	// �α��� �޴�
	private static void MoveLoginMenu() {
		ClearDisplay();

		System.out.println(" ====== �α��� �޴� ====== ");
		System.out.print(" ���� �Է� :  ");
		
		String id = input.nextLine();
		
		System.out.println("");
		System.out.print(" �н����� �Է� :  ");
		String pw = input.nextLine();
		
		if (userTable.containsKey(id) && userTable.get(id).getPw().equals(pw)) {
			// �α��� ����
			MoveHomeMenu(id);
		} else {
			// �α��� ���� (���� ����)
			MoveNullIdMenu("���̵� Ȥ�� ��й�ȣ�� �ٸ��ϴ�.");
		}
	}

	// Ȩ �޴�
	// �α��� ������ ȭ��
	private static void MoveHomeMenu(String id) {

		ClearDisplay();
		System.out.println(" ====== Ȩ �޴� ====== ");
		System.out.println(" ���� : " + id);
		System.out.println(" �α��� ���� ");
		
	}

	// �α��� ���н� ȭ��
	private static void MoveNullIdMenu(String msg) {

		while (true) {
			ClearDisplay();

			System.out.println(" ====== �α��� �޴� ====== ");
			System.out.println(msg);
			System.out.println(" 1. ���ư��� ");

			String num = input.nextLine();
			
			if (num.equals("1")) {
				MoveMainMenu();
				break;
			}
		}
	}



	// ����
//	public static void main(String[] args) {
//
//		String loginId = "juno";
//		String loginPw = "1234";
//		
//		Scanner scanner = new Scanner(System.in); 
//		
//		System.out.print("�α��� �� ID�� �Է��ϼ��� : ");
//		String id = scanner.nextLine();
//		System.out.printf("�Է��Ͻ� ID�� : %s �Դϴ�. \n\n", id);
//
//		System.out.print("�α��� �� PW�� �Է��ϼ��� : ");
//		String pw = scanner.nextLine();
//		System.out.println("���� ���Դϴ�.");
//		
//		scanner.close();
//		
//		if (id.equals(loginId) && pw.equals(loginPw)) {
//			onLoginSuccess();
//		}
//		else {
//			onLoginFail();
//		}
//	}
	
//	private static void onLoginFail() {
//
//		System.out.println("�α��� ����.");
//		System.out.println("ID�� PW�� �ٸ��ϴ�.");
//	}
//
//	private static void onLoginSuccess() {
//
//		System.out.println("�α��� ����.");
//	}
	
}

//������

//====== ���� �޴� ====== 
//1. ȸ������ 
//2. �α��� 
//
//�Է� :  

//====== ȸ������ �޴� ====== 
//���� �Է� :  kkk
//
//�н����� �Է� :  

//====== ȸ������ �޴� ====== 
//���� �Ϸ� 
//1. ���ư��� 

//====== �α��� �޴� ====== 
//���� �Է� :  kkk
//
//�н����� �Է� :  

//====== �α��� �޴� ====== 
//���̵� Ȥ�� ��й�ȣ�� �ٸ��ϴ�.
//1. ���ư��� 

//====== Ȩ �޴� ====== 
//���� : kkk
//�α��� ���� 
