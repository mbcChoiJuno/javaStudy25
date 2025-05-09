package ch01;

// 프로모션 테스트 (형변환)
public class PromotionExam {

	public static void main(String[] args) {

		// 작은 타입 >> 큰 타입
		// byte(1) short(2) int(4) float(4) long(8) double(8)

		doPromotion();
	}
	
	public static void doPromotion() {

		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println(String.format("자동타입 변형된 int : %d", intValue)); // byte to int
	
		char charValue = '가';
		intValue = charValue;
		System.out.println(String.format("자동타입 변형된 int : %d", intValue)); // char to int
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(String.format("자동타입 변형된 long : %d", longValue)); // int to long
		
		double doubleValue = intValue;
		System.out.println(String.format("자동타입 변형된 double : %01.01f", doubleValue)); // int to double
		System.out.println("자동타입 변형된 double : " + doubleValue); // int to double
		
	}

}

//실행결과
//자동타입 변형된 int : 10
//자동타입 변형된 int : 44032
//자동타입 변형된 long : 500
//자동타입 변형된 double : 500.0
//자동타입 변형된 double : 500.0