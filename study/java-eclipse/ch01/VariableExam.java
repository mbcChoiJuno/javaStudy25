package ch01;

//변수 선언 연습
public class VariableExam {

	public static void main(String[] args) {

		int mach;
		int distance;
		mach = 340;
		distance = mach * 60 * 60; // 음속 m/s
		
		System.out.println("소리가 1시간 동안 가는 거리");
		System.out.println(distance + "m");

		double radius; // 실수 타입의 radius 변수 선언
		double area; // 실수 타입의 area 변수 선언
		// 실수타입은 소수점이 있다
		
		radius = 10; // 초기값이 정수이지만 실수타입으로 변경됨
		area = radius * radius *3.14;
		System.out.print("반지름이 " + radius + " 인");
		System.out.println(" 원의 넓이 : " + area);
	}

}

//실행결과
//소리가 1시간 동안 가는 거리
//1224000m
//반지름이 10.0 인 원의 넓이 : 314.0