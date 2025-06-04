package ch04.car;

/**
 * Car 클래스 수업
 * 
 * @author 10-2
 *
 */
public class CarController {

	private Car myCar;
	
	private int currentSpeed;
	
	public CarController(Car myCar) { 
		this.myCar = myCar;
	}
	
	/**
	 * 현재 속도 조회 
	 * @return
	 */
	public int getCurrentSpeed() {
		return currentSpeed;
	}

	/**
	 * 가속 컨트롤
	 */
	public void onPutAccelerator() {
		
		currentSpeed += 10;
		
		if (currentSpeed >= myCar.getMaxSpeedKmh()) {
			currentSpeed = myCar.getMaxSpeedKmh();
		}
	}

	/**
	 * 감속 컨트롤
	 */
	public void onPutBreak() {
		
		currentSpeed -= 10;
		
		if (0 >= currentSpeed) {
			currentSpeed = 0;
		}
	}
}
