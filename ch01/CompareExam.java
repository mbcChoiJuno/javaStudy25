package ch01;

// 동등비교 테스트
public class CompareExam {

	public static void main(String[] args) {
		
		doCompare();
	}

	private static void doCompare() {

		// 동등 비교와, 크기 비교
		// == 같음
		// != 다름
		// >, >= 초과, 이상
		// <, == 미만, 이하

		int num1 = 10;
		int num2 = 10;
		boolean isTrue = (num1 <= num2);
		System.out.println(isTrue);

		char C1 = 'A'; // 65
		char c1 = 'a'; // 97
		char C2 = 'B'; // 66
		isTrue = (C1 == c1);
		System.out.println(isTrue);

		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);

		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v4 == v5);
		System.out.println((float) v4 == v5);
		System.out.println(v4 == (double) v5);
		System.out.println((int) v4 * 10 == (int) v5 * 10);

		// 실수형(소수점)은 부동 소수점 연산을 수행해서 근사값으로 표현

//		// jo
//		float eee = 10 / 3f;
//		System.out.println(eee);
//		System.out.println(eee == 10 / 3f);

	}

}

//실행결과
//true
//false
//true
//0.1
//0.1
//false
//true
//false
//true