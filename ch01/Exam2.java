package ch01;

import java.util.Scanner;

// Scanner 객체 테스트
// 삼항 연산자로 홀짝 구분
public class Exam2 {

	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 >>> ");
		
		int num = scan.nextInt();
		
		System.out.println( (num % 2 == 0) ? "짝수" : "홀수");

	}

}

//실행결과
//정수를 입력하세요 >>> 1
//홀수

//정수를 입력하세요 >>> 2
//짝수