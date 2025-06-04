package ch01;

// 명령 연산자 테스트
public class OperationExam {

	public static void main(String[] args) {
		
		// 단항 테스트
		int x = 10;
		x++;
		System.out.println("10에 ++ 단항 연산 : " + x);
		x--;
		System.out.println("x에 -- 단항 연산 : " + x);
		
		
		// 이항 테스트
		int y = 20;
		int result = x+ y;
		System.out.println(result);
		
		
		// 삼항 테스트
		boolean isBig = (result > 10) ? true : false;
		System.out.println(isBig);
		
		String strResult = (result > 50) ? "크다" : "작다";
		System.out.println(strResult);
		
		int x1 = 10 * 10;
		System.out.println("10x10="+x1);
		
		int x2 = 10 / 3;
		System.out.println("10/5="+x2);
		
		int x3 = 10 % 3;
		System.out.println("10%5="+x3);
		
		
		//미션 3항 연산자를 사용하여 홀짝 계산을 해보자
		// 홀수 짝수 구분하기
		int inputNumber = 11;
		String strEven = ((inputNumber % 2) == 0 ? "짝수" : "홀수");
		System.out.println(String.format("%d = %s",  inputNumber, strEven));
		
		
		//미션 3항 연산자를 사용하여 4의 배수를 찾아보자
		// n의 배수 구분하기
	    int multiple = 4;
		
		int inputNumber2 = 24;
		String resultMultiple = (inputNumber2 % multiple == 0) ? "맞음" : "아님";
		
		System.out.println(inputNumber2 + " = " + multiple + "의 배수 " + resultMultiple);
		
		
		// 증감연산자 테스트
		System.out.println("------------- 증감 연산자 위치에 따른 결과 -----------");
		int a = 10;
		a++;
		++a;
		System.out.println("10 -> a++ -> ++a의 결과 : " + a);

		int b = 10;
		b--;
		--b;
		System.out.println("10 -> b-- -> --b의 결과 : " + b); // 8
		
		int c;
		c = a++; // c = a ---> a = a + 1
		System.out.println("a:"+a); // 13
		System.out.println("c:"+c); // 12
		System.out.println("------------------------");
		
		c = ++a; // c = a = a + 1
		System.out.println("a:"+a); // 14
		System.out.println("c:"+c); // 14
		System.out.println("------------------------");
		
		c = ++a + b++;  // c = 15 + 8
		System.out.println("a:"+a); // 15
		System.out.println("b:"+b); // 9
		System.out.println("c:"+c); // 23
		System.out.println("------------------------");

		
	}

}

//실행결과
//10에 ++ 단항 연산 : 11
//x에 -- 단항 연산 : 10
//30
//true
//작다
//10x10=100
//10/5=3
//10%5=1
//11 = 홀수
//24 = 4의 배수 맞음
//------------- 증감 연산자 위치에 따른 결과 -----------
//10 -> a++ -> ++a의 결과 : 12
//10 -> b-- -> --b의 결과 : 8
//a:13
//c:12
//------------------------
//a:14
//c:14
//------------------------
//a:15
//b:9
//c:23
//------------------------