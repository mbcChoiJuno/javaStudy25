package ch01;

// 문자열 비교 테스트
public class StringEqualsExam {

	public static void main(String[] args) {

		doEquals();
	}

	private static void doEquals() {

		String strval1 = "최준오";
		String strval2 = "최준오";
		String strval3 = new String("최준오");

		System.out.println(strval1 == strval2);
		System.out.println(strval1.toString());
		System.out.println(strval3.toString());
		System.out.println(strval1.toString() == strval3.toString());

		// 객체의 값 비교를 위해서는 내부 메서드 사용
		boolean eq1 = strval1.equals(strval3);
		System.out.println("String의 equals 메서드 사용 결과: " + eq1);

		// jo
		System.out.println(strval1.equals(strval3));
	}

}

//실행결과
//true
//최준오
//최준오
//false
//String의 equals 메서드 사용 결과: true
//true