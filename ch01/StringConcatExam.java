package ch01;

// 문자열 연결 테스트
public class StringConcatExam {

	public static void main(String[] args) {

		doConcat();
	}

	private static void doConcat() {
		
		// print("문자열" + "입니다.") -> + 연결 연산자
		
		String str1 = "JDK" + 17.0;
		System.out.println(str1);

		String str2 = str1 + "특징";
		System.out.println(str2);

		String str3 =  "jdk" + 3 + 3.0;
		System.out.println(str3);

		String str4 =  3 + 3.0 + "jdk";
		System.out.println(str4);
		
		// 코드 흐름
		// 위에서 아래로
		// 왼쪽에서 오른쪽으로 감
		
		
		// jo
		StringBuilder sb = new StringBuilder();
		sb.append("문자열");
		sb.append("입니다.");
		System.out.println(sb.toString());
	}

}

//실행결과
//JDK17.0
//JDK17.0특징
//jdk33.0
//6.0jdk
//문자열입니다.