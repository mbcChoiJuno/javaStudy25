package ch01;

import java.util.Scanner;

// 논리곱 테스트용
public class LogicalAndExam {

	public static void main(String[] args) {

		//jo
		//doConvertASCII();

		Scanner input = new Scanner(System.in);
		System.out.println("정수를 입력하시면 대 소문자나 숫자를 판단해 드릴게요");
		System.out.println("유니코드 표를 참고하여 프로그램을 제작하였습니다.");
		System.out.print("숫자 입력 >> ");
		
		int charCode = input.nextInt();
		
		if ((90 >= charCode) && (charCode >= 65)) { // 대문자
			
			System.out.println("현재 입력된 숫자는 대문자 입니다. : " + (char)charCode);
			
		} else if ((122 >= charCode) && (charCode >= 97)) {
			
			System.out.println("현재 입력된 숫자는 소문자 입니다. : " + (char)charCode);
			
		} else if (!( (57 > charCode) && (charCode > 48) )) {
//		} else if (!(57 > charCode) && !(charCode > 48)) {
			
			System.out.println("현재 입력된 숫자는 유니코드의 문자형 숫자 입니다. : " + (char)charCode);
			
		} else {
			
			System.out.println("대문자, 소문자, 숫자의 유니코드 표에 없는 숫자입니다.");
			System.out.println("프로그램을 다시 실행 해주세요");
			
		}
	}

	private static void doConvertASCII() {
		
		Scanner input = new Scanner(System.in);
		
		while (true) {

			String result = "";
			
			System.out.print("\n문자나 정수 입력 >>> ");
			
			String target = input.next();

			// 숫자 판단
			int charCode = 0;

			try {
				charCode = Integer.parseInt(target);			
				// 숫자임
				
				// 숫자 -> 아스키 문자로 변환
				System.out.printf("ASCII 변환 >> %d -> '%s'\n", charCode, (char)charCode);
				
			} catch (Exception e) {
				// 숫자가 아님
				
				if (target.length() == 1) {
					
					// char -> 숫자로 변환
					System.out.printf("ASCII 변환 >> '%s' -> %d\n", target, (int)target.charAt(0));
				
				} else {

					System.out.println("**한글자만 입력**");
					continue;
					
				}
			}
		}
	}
}

//실행결과

//정수를 입력하시면 대 소문자나 숫자를 판단해 드릴게요
//유니코드 표를 참고하여 프로그램을 제작하였습니다.
//숫자 입력 >> 65
//현재 입력된 숫자는 대문자 입니다. : A

//정수를 입력하시면 대 소문자나 숫자를 판단해 드릴게요
//유니코드 표를 참고하여 프로그램을 제작하였습니다.
//숫자 입력 >> 97
//현재 입력된 숫자는 소문자 입니다. : a

//정수를 입력하시면 대 소문자나 숫자를 판단해 드릴게요
//유니코드 표를 참고하여 프로그램을 제작하였습니다.
//숫자 입력 >> 6
//현재 입력된 숫자는 유니코드의 문자형 숫자 입니다. : 