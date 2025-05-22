package ch04.car;

/**
 * Car 클래스 수업
 * 
 * @author 10-2
 *
 */
public class CarEngine {
	
	// 최대 속도
	private int maxSpeedKmh = 0;
	
	// 엔진 On Off 여부
	public boolean isOn = false;
	
	public CarEngine(int maxSpeedKmh) {
		this.maxSpeedKmh = maxSpeedKmh;
	}

	/**
	 * 최대 속도 조회
	 * @return
	 */
	public int getMaxSpeedKmh() {
		return maxSpeedKmh;
	}
}
