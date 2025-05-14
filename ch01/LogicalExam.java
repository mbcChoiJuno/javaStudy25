package ch01;

import java.util.HashMap;
import java.util.Scanner;

// 유저 데이터 클래스
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

// 논리연산 테스트
// 로그인 기능 구현 연습
public class LogicalExam {

	static HashMap<String, UserData> userTable = new HashMap<String, UserData>();
	static Scanner input; 
	static int scene = 0; // 0 메인 화면, 1 가입 화면, 2 로그인 화면


	// 콘솔 정리용
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
		
		// 1. 메뉴 표시
		MoveMainMenu();
	}
	
	// 1. 메인 메뉴
	// 회원가입
	// 로그인
	private static void MoveMainMenu() {
		while (true) {
			ClearDisplay();

			System.out.println(" ====== 메인 메뉴 ====== ");
			System.out.println(" 1. 회원가입 ");
			System.out.println(" 2. 로그인 ");
			System.out.println("");
			System.out.print(" 입력 :  ");
			
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
	
	// 회원가입 메뉴
	private static void MoveRegistMenu() {
		while (true) {
			ClearDisplay();

			System.out.println(" ====== 회원가입 메뉴 ====== ");
			System.out.print(" 계정 입력 :  ");
			
			String id = input.nextLine();
			
			if (userTable.containsKey(id)) {
				continue;
			}
			else {

				System.out.println("");
				System.out.print(" 패스워드 입력 :  ");
				String pw = input.nextLine();
				
				userTable.put(id,new UserData(id, pw));
				
				MoveRegistDoneMenu();
				break;
			}
		}
	}

	// 회원가입 완료 화면
	private static void MoveRegistDoneMenu() {

		while (true) {
			ClearDisplay();

			System.out.println(" ====== 회원가입 메뉴 ====== ");
			System.out.println(" 가입 완료 ");
			System.out.println(" 1. 돌아가기 ");

			String num = input.nextLine();

			if (num.equals("1")) {
				MoveMainMenu();
				break;
			}
		}
	}

	// 로그인 메뉴
	private static void MoveLoginMenu() {
		ClearDisplay();

		System.out.println(" ====== 로그인 메뉴 ====== ");
		System.out.print(" 계정 입력 :  ");
		
		String id = input.nextLine();
		
		System.out.println("");
		System.out.print(" 패스워드 입력 :  ");
		String pw = input.nextLine();
		
		if (userTable.containsKey(id) && userTable.get(id).getPw().equals(pw)) {
			// 로그인 성공
			MoveHomeMenu(id);
		} else {
			// 로그인 실패 (없는 계정)
			MoveNullIdMenu("아이디 혹은 비밀번호가 다릅니다.");
		}
	}

	// 홈 메뉴
	// 로그인 성공시 화면
	private static void MoveHomeMenu(String id) {

		ClearDisplay();
		System.out.println(" ====== 홈 메뉴 ====== ");
		System.out.println(" 계정 : " + id);
		System.out.println(" 로그인 성공 ");
		
	}

	// 로그인 실패시 화면
	private static void MoveNullIdMenu(String msg) {

		while (true) {
			ClearDisplay();

			System.out.println(" ====== 로그인 메뉴 ====== ");
			System.out.println(msg);
			System.out.println(" 1. 돌아가기 ");

			String num = input.nextLine();
			
			if (num.equals("1")) {
				MoveMainMenu();
				break;
			}
		}
	}



	// 수업
//	public static void main(String[] args) {
//
//		String loginId = "juno";
//		String loginPw = "1234";
//		
//		Scanner scanner = new Scanner(System.in); 
//		
//		System.out.print("로그인 할 ID를 입력하세요 : ");
//		String id = scanner.nextLine();
//		System.out.printf("입력하신 ID는 : %s 입니다. \n\n", id);
//
//		System.out.print("로그인 할 PW를 입력하세요 : ");
//		String pw = scanner.nextLine();
//		System.out.println("검증 중입니다.");
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
//		System.out.println("로그인 실패.");
//		System.out.println("ID나 PW가 다릅니다.");
//	}
//
//	private static void onLoginSuccess() {
//
//		System.out.println("로그인 성공.");
//	}
	
}

//실행결과

//====== 메인 메뉴 ====== 
//1. 회원가입 
//2. 로그인 
//
//입력 :  

//====== 회원가입 메뉴 ====== 
//계정 입력 :  kkk
//
//패스워드 입력 :  

//====== 회원가입 메뉴 ====== 
//가입 완료 
//1. 돌아가기 

//====== 로그인 메뉴 ====== 
//계정 입력 :  kkk
//
//패스워드 입력 :  

//====== 로그인 메뉴 ====== 
//아이디 혹은 비밀번호가 다릅니다.
//1. 돌아가기 

//====== 홈 메뉴 ====== 
//계정 : kkk
//로그인 성공 