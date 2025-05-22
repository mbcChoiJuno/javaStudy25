package ch04.car;

import java.util.Scanner;

/**
 * Car 클래스 수업
 * 
 * @author 10-2
 *
 */
public class CarExam {

	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		doExam();
	}
	
	/**
	 * Scanner 잘못된 입력값 받을시 통합 오류 메세지
	 */
	private static void badInputException() {

		Alert.print("[System] 입력값을 확인하고 다시 입력하세요", 1);
	}
	
	/**
	 * UI
	 * 메인 화면
	 */
	private static void doExam() {

		// UI
		System.out.printf("===차량정보 입력===\n");

		// Input company
		System.out.printf("제조회사:");
		var company = in.next();
		
		// Input model
		System.out.printf("모델명:");
		var model = in.next();

		// Input color
		System.out.printf("색상:");
		var color = in.next();

		// Input maxSpeedKmh
		System.out.printf("최대시속:");
		var maxSpeedKmh = Integer.parseInt(in.next());

		Car myCar = new Car(company, model, color, maxSpeedKmh);

		boolean run = true;

		while (run) {
			// UI
			System.out.printf("\n");
			System.out.printf("차량 시동상태: %s\n", (myCar.isOnPower() ? "[ON]" : "[OFF]"));
			System.out.printf("------ 메인화면 ------\n");
			System.out.printf("1. 차량 정보 조회\n");
			System.out.printf("2. 차량 시동 걸기\n");
			System.out.printf("3. 차량 주행 시작\n");
			System.out.printf("4. 차량 주행 종료\n");

			// Input
			System.out.println();
			System.out.println("원하는 메뉴 번호를 입력하세요.");
			System.out.print(">>>");
			var select = in.next();

			// Controller
			switch (select) {
			
				case "1" -> { // 1. 차량 정보 조회
					myCar.showInfo();
				}
				
				case "2" -> { // 2. 차량 시동 걸기
					if(myCar.isOnPower()) {
						
						Alert.print("이미 차량 시동이 켜져있습니다.", 1);
						
					} else {
						
						Alert.print("차량 시동이 걸렸습니다.", 1);
						myCar.setOnPower(true);
					}
				}
				
				case "3" -> { // 3. 차량 주행 시작
					if (myCar.isOnPower()) {
						
						gotoDrivePage(myCar);
						
					} else {
						
						Alert.print("우선 차량 시동을 걸어주세요.", 1);
					}
				}
				
				case "4" -> { // 4. 차량 주행 종료
					run = false; 
				}
				
				default -> {
					badInputException();
				}
			}

			System.out.println();
		}

		System.out.println("프로그램이 종료되었습니다.");
		System.exit(0);
	}

	/**
	 * UI
	 * 차량 주행 화면
	 * @param myCar
	 */
	private static void gotoDrivePage(Car myCar) {
		
		while (myCar.isOnPower()) {
			
			// UI
			myCar.showHMD(); // 계기판 표시

			System.out.print("1. 시동끄기\n");
			System.out.print("2. 엑셀\n");
			System.out.print("3. 브레이크\n");
			System.out.print("(1~3) >>>> ");
			var select = in.next();

			// Controller
			switch (select) {
			
				case "1" -> { // 1. 시동끄기
					
					if (myCar.getCurrentSpeed() == 0) {
						myCar.setOnPower(false);
						
					} else {
						Alert.print("속도가 0이 아니면 시동을 끌 수 없습니다.", 1);
					}
				}
				
				case "2" -> { // 2. 엑셀
					myCar.putAccelerator();
				}
				
				case "3" -> { // 3. 브레이크
					myCar.putBreak();
				}
				
				default -> {
					badInputException();
				}
			}
		}
		
		
	}
}
