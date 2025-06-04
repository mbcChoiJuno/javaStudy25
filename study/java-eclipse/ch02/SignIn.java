package ch02;

class UserData {
	
	private String name = "";
	
	private int year = 0;
	private int month = 0;
	private int day = 0;
	
	private int gender = 0; //0:남자, 1:여자
	
	private int randomCode = 0;
	
	private int checkCode = 0;
	
	

	public UserData(String name) {
		this.name = name;
	}
	
	public void setRrn(String strRrn) {
		doSplitResident(strRrn);
	}

	private void doSplitResident(String strRrn) {
		year = Integer.parseInt(strRrn.substring(0, 2));
		month = Integer.parseInt(strRrn.substring(2, 4));
		day = Integer.parseInt(strRrn.substring(4, 6));
		
		// 9, 0: 1800년도 남, 여
		// 1, 2: 1900년도 남, 여  5, 6 (외국인)
		// 3, 4: 2000년도 남, 여  7, 8 (외국인)
 		var genderCode = strRrn.substring(6, 7); 
 		
 		switch (genderCode) {
 		case "0": // 여자
 		case "9": // 남자
 			year += 1800;
 			break;
 			
 		case "2": // 여자
 		case "6":
 			gender = 1;
 		case "1": // 남자
 		case "5":
 			year += 1900;
 			break;
 			
 		case "4": // 여자
 		case "8":
 			gender = 1;
 		case "3": // 남자
 		case "7": 
 			year += 2000;
 			break;
 		}
 		
 		randomCode = Integer.parseInt(strRrn.substring(7, 11));
 		
 		checkCode = Integer.parseInt(strRrn.substring(11, 13));
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return (gender % 2 == 0) ? "남자" : "여자";
	}

	public String getRandomCode() {
		return String.format("%04d", randomCode);
	}

	public String getCheckCode() {
		return String.format("%02d", checkCode);
	}

	
}

// 주민번호 과제
public class SignIn {
	
	static UserData currntUser = null;

	public static void main(String[] args) {
		
		doSignIn();
	}

	private static void doSignIn() {
		UiHandler uiHandler = new UiHandler();
		
		var ui = uiHandler.createUi("개인정보 입력");
		
		// 1. 이름 입력
		var input = ui.runUi("이름을 입력하세요.");
		
		var name = input;
		
		currntUser = new UserData(name);
		
		doInputResident();
	}

	private static void doInputResident() {
		UiHandler uiHandler = new UiHandler();
		
		var ui = uiHandler.createUi("주민등록 번호");
		
		String input = ui.runUi("'-'를 제외한 주민등록 번호 13자리를 입력하세요.");
		
		String strRrn = input; 
		currntUser.setRrn(strRrn);

		showUserInfo();
	}

	private static void showUserInfo() {
		UiHandler uiHandler = new UiHandler();
		
		var ui = uiHandler.createUi("유저 정보 표시");
		
		ui.addDescription(String.format("이름 : %s", currntUser.getName()));
		ui.addDescription(String.format("출생일 : %d년 %d월 %d일", currntUser.getYear(), currntUser.getMonth(), currntUser.getDay()));
		ui.addDescription(String.format("성별 : %s", currntUser.getGender()));
		ui.addDescription(String.format("랜덤코드 : %s", currntUser.getRandomCode()));
		ui.addDescription(String.format("검증코드 : %s", currntUser.getCheckCode()));
		ui.runUi("프로그램 종료");
	}

}
