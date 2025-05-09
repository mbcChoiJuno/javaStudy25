package ch01;

// 지역변수 테스트
public class LocalVariableExam {

	public static void main(String[] args) {

		// 변수의 사용 범위는 괄호(블럭) 안에서 효과를 발휘함
		
		int v1 = 15;
		int v2 = 0; // 변수 선언은 위에서 다 할것!!!
		
		if (v1 > 10) { // if 는 비교문으로 괄호값이 참이면 블럭을 실행한다.
//			int v2 = v1 + 10;
			v2 = v1 + 10;
		}

		int v3 = v1 + v2 + 5;
		
		System.out.println("v1의 값:"+v1);
		System.out.println("v2의 값:"+v2);
		System.out.println("v3의 값:"+v3);
	}

}

//실행결과
//v1의 값:15
//v2의 값:25
//v3의 값:45