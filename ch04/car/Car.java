package ch04.car;

/**
 * Car 클래스 수업
 * 
 * @author 10-2
 *
 */
public class Car {

	// 제조사
	private String company;
	// 모델명
	private String model;
	// 색상
	private String color;
	
	/**
	 * 변수:
	 *   차량 최대속도
	 *   엔진 On Off 여부
	 */
	private CarEngine engine;
	
	/**
	 * 컨트롤 관련
	 *   변수:현재속도
	 *   함수:엑셀, 브레이크
	 */
	private CarController controller;	
	
	public Car(String company, String model, String color, int maxSpeedKmh) {
		this.company = company;
		this.model = model;
		this.color = color;
		
		engine = new CarEngine(maxSpeedKmh);
		controller = new CarController(this);
	}
	
	/**
	 * Console에 차 정보를 표시한다.
	 */
	public void showInfo() {
		
		System.out.printf("\n");
		System.out.printf("====================\n");
		System.out.printf("현재 차량의 제조회사는 : %s\n", company);
		System.out.printf("모델명 : %s\n", model);
		System.out.printf("색상은 %s입니다.\n", color);
		System.out.printf("====================\n");

		Alert.print("3초 후에 메인화면으로 돌아갑니다..", 3);
	}
	
	/**
	 * Console에 계기판 UI를 표시한다.
	 * 
	 */
	public void showHMD() {

		System.out.printf("\n");
		System.out.printf("====== 계기판 ======\n");
		System.out.printf("차종 : %s %s\n", company, model);
		System.out.printf("속도 : %d/%d Km/h\n", controller.getCurrentSpeed(), engine.getMaxSpeedKmh());
		System.out.printf("\n");
		System.out.print("==================\n");
	}

	/**
	 * 엑셀을 밟는다.
	 */
	public void putAccelerator() {
		
		controller.onPutAccelerator();
	}
	
	/**
	 * 브레이크를 밟는다.
	 */
	public void putBreak() {

		controller.onPutBreak();
	}


	/**
	 * 엔진 On/Off 여부 조회
	 * @return
	 */
	public boolean isOnPower() {
		
		return engine.isOn;
	}
	
	/**
	 * 엔진 On/Off
	 * @param isOn
	 */
	public void setOnPower(boolean isOn) {
		
		engine.isOn = isOn;
	}

	/**
	 * 엔진 성능 최대속도 조회
	 * @return
	 */
	public int getMaxSpeedKmh() {
		
		return engine.getMaxSpeedKmh();
	}

	/**
	 * 현재 속도 조회
	 * @return
	 */
	public int getCurrentSpeed() {

		return controller.getCurrentSpeed();
	}
}
