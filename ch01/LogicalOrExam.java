package ch01;

import java.util.Scanner;

// 논리합 테스트용
public class LogicalOrExam {

	public static void main(String[] args) {

		// 키보드로 입력받은 숫자가 2의 배수이거나 3의 배수인 것을 처리해본다.
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.print("입력한 정수가 2나 3의 배수인지 확인합니다. >>> ");
			
			int num = input.nextInt();
			
			if ((num % 2 == 0) || (num % 3 == 0)) {
				
				System.out.printf("%d : %d의 배수입니다.\n", num, ((num % 2 == 0) ? 2 : 3));
				
			} else {
				
				System.out.printf("%d : 2나 3의 배수가 아닙니다.\n", num);
				
			}
		}
	}
}

//실행결과
//입력한 정수가 2나 3의 배수인지 확인합니다. >>> 3
//3 : 3의 배수입니다.
//입력한 정수가 2나 3의 배수인지 확인합니다. >>> 2
//2 : 2의 배수입니다.
//입력한 정수가 2나 3의 배수인지 확인합니다. >>> 7
//7 : 2나 3의 배수가 아닙니다.