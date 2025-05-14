package ch02;

import java.util.HashMap;
import java.util.Scanner;

class Car {
	private String name;
	private int maxSpeed = 0;

	public Car(String name, int maxSpeed) {
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	public String getName() {
		return name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
}

// 자동차 과제
public class CarDrive {

	static HashMap<String, Car> carHashMap = new HashMap<String, Car>();

	static Car currentCar = null;

	static int MIN_SPEED = 0;
	static int MAX_SPEED = 300;

	static int RECOMMEND_SPEED_MIN = 40;
	static int RECOMMEND_SPEED_MAX = 80;

	private static void clearUi() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}
	
	public static void main(String[] args) {

		// 차 테이블 등록
		carHashMap.put("마티즈", new Car("마티즈", 100));
		carHashMap.put("BMW", new Car("마티즈", 200));
		carHashMap.put("람보르기니", new Car("마티즈", 300));

		doSelectCar();

	}

	private static void doSelectCar() {
		Scanner in = new Scanner(System.in);

		boolean isSelected = false;
		
		while (isSelected == false) {
			
			clearUi();
			System.out.println("====== 차 고르기 ======");
			System.out.println("차를 고르세요.");
			System.out.println("1. 마티즈");
			System.out.println("2. BMW");
			System.out.println("3. 람보르기니");
			System.out.println("9. 프로그램 종료");
			System.out.print("(1~9) >>>> ");

			switch (in.next()) {
			case "1":
				currentCar = carHashMap.get("마티즈");
				isSelected = true;
				break;
			case "2":
				currentCar = carHashMap.get("BMW");
				isSelected = true;
				break;
			case "3":
				currentCar = carHashMap.get("람보르기니");
				isSelected = true;
				break;
			case "9":
				System.exit(0);
				break;
			default:
				
				break;
			}
		}

		doReady();
	}

	private static void doReady() {

		Scanner in = new Scanner(System.in);

		while (true) {

			clearUi();
			System.out.println("====== 출고 ======");
			System.out.printf("%s가 출고되었습니다.\n", currentCar.getName());
			System.out.printf("최고 속도는 %dKm/h 입니다.\n", currentCar.getMaxSpeed());
			System.out.println("1. 시동걸기");
			System.out.println("2. 다시고르기");
			System.out.print("(1~2) >>>> ");

			switch (in.next()) {
			case "1":
				doDriveCar();
				break;
			case "2":
				doSelectCar();
				break;
			default:
				
				break;
			}
		}
	}

	private static void doDriveCar() {

		Scanner in = new Scanner(System.in);
		
		int currentSpeed = 0;

		while (true) {

			clearUi();
			System.out.println("====== 계기판 ======");
			System.out.printf("차종 : %s\n", currentCar.getName());
			System.out.printf("속도 : %d/%d Km/h\n", currentSpeed, currentCar.getMaxSpeed());
			System.out.println();
			System.out.println("==================");
			System.out.println("1. 시동끄기");
			System.out.println("2. 엑셀");
			System.out.println("3. 브레이크");
			System.out.print("(1~3) >>>> ");

			switch (in.next()) {
			case "1":
				if (currentSpeed == 0) {

					clearUi();
					System.out.println("====== 계기판 ======");
					System.out.printf("차종 : %s\n", currentCar.getName());
					System.out.printf("속도 : %d/%d Km/h\n", currentSpeed, currentCar.getMaxSpeed());
					System.out.println();
					System.out.println("==================");
					System.out.println("시동을 종료하고 차종을 다시 고릅니다.");
					System.out.print("(아무 키나 입력) >>>> ");
					
					in.next();
					
					doSelectCar();
					
				} else {

					clearUi();
					System.out.println("====== 계기판 ======");
					System.out.printf("차종 : %s\n", currentCar.getName());
					System.out.printf("속도 : %d/%d Km/h\n", currentSpeed, currentCar.getMaxSpeed());
					System.out.println();
					System.out.println("==================");
					System.out.println("속도가 0이 아니면 시동을 끌 수 없습니다.");
					System.out.print("(아무 키나 입력) >>>> ");
					
					in.next();
				}
				break;
			case "2":
				currentSpeed += 10;
				break;
			case "3":
				currentSpeed -= 10;
				break;
			default:
				
				break;
			}

			if (0 > currentSpeed) 
				currentSpeed = 0;
			
			if (currentSpeed > currentCar.getMaxSpeed())
				currentSpeed = currentCar.getMaxSpeed();
			
		}
		
		

	}
}
