package ch01;

// 변수 선언 연습
public class VarExam {

	public static void main(String[] args) {
		
		// 변수선언 테스트
		int x = 1; // 정수타입 x 변수에 1값을 넣는다.
		
		char y = 65; // char는 문자타입인데 숫자로 변환됨
					// 컴퓨터는 문자를 유니코드로 변환해서 처리함
					// 유니코드 표에 65는 A
		
		char z = 'A'; // char 타입의 z 변수에 문자 A를 넣음
		
		System.out.println("int x = "+x);
		System.out.println("char y = "+y);
		System.out.println("char z = "+z);
		
		
		char z1 = 'b';
		
		// 변수의 선언
		int x1; // 초기화 안된 변수
		x1 = 10;
		System.out.println(x1);
		
		// 다중 변수 선언
		int kor, mat, eng, total, avg;
		
		kor = 90;
		mat = 80;
		eng = 70;
		total = kor + mat + eng;
		avg = total / 3;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		
		// 변수 작성 규칙
		// 첫글자 영문, $, _ 로 시작
		// 스네이크 표기법
		
		int price, $price, _price; // 가급적 특수문자 사용 지양

//		int 1v;
//		int @speed;
//		int $#value;
		
		char firstname = '김';
		char firstName = '이';

		System.out.println("성 : " + firstname);
		System.out.println("성 : " + firstName);
		// 변수명에 대소문자는 다른 변수로 인식한다.
		
		// 변수명에 예약어는 사용할 수 없다.
		// 예약어는 자바에서 이미 사용중인 영문 (변수, 클래스)
		// int char;
		
		
		// 리터럴 : 직접 입력된 값
		int literal1 = 75; 	// 10진수
		int literal2 = 075;	// 8진수
		int literal3 = 0b0011;	// 2진수
		int literal4 = 0xA;	// 16진수
		
		System.out.println("10진수 75 :" + literal1);
		System.out.println("8진수 75 :" + literal2);
		System.out.println("2진수 0011 :" + literal3);
		System.out.println("16진수 A :" + literal4);
		
	}

}

//실행결과
//int x = 1
//char y = A
//char z = A
//10
//총점 : 240
//평균 : 80
//성 : 김
//성 : 이
//10진수 75 :75
//8진수 75 :61
//2진수 0011 :3
//16진수 A :10