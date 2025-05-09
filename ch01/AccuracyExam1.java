package ch01;

// float, double을 통한 계산 시 
// 부동 소수점 때문에 뒤에 값을 추정하게 되어 정확하게 계산되지 않는다.
public class AccuracyExam1 {

	public static void main(String[] args) {

		int apple = 1;
		double piecePer = 0.1f;

		int piece = 7;

		double result = apple - (piece * piecePer);

		System.out.println(String.format("남은 사과 : %f 조각", result));
	}

}

//실행 결과
//남은 사과 : 0.300000 조각