package ch01;

// 정확한 계산이 필요할 때 방법 

// 1. 정수형을 이용해 계산한다.

// 2. BigDecimal을 이용한다. (수업내용 아님)

// 정수형을 이용해 정확한 계산
public class AccuracyExam2 {

	public static void main(String[] args) {

		int apple = 1;
		int totalPieces = apple * 10;
		int subPiece = 7;
		int tmp = totalPieces - subPiece;

		float result = tmp / 10.0f;
		System.out.println("남은 사과 조각 수 : " + result);
	}

}

//실행 결과
//남은 사과 조각 수 : 0.3