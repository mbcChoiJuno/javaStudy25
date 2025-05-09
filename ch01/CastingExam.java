package ch01;

//캐스팅 테스트 (형변환)
public class CastingExam {

	public static void main(String[] args) {
		
		doCasting();
	}

	public static void doCasting() {

		int intValue = 123456789;
		byte byteValue = (byte) intValue; // int to byte

		System.out.println(String.format("int 타입 값 출력 : %d", intValue)); // byte to int 1
		System.out.println(String.format("byte 타입 값 출력 : %d", byteValue)); // byte to int 2

//		0111 0101 1011 1100 1101 0001 0101
//													 0001 0101 -> 21

		int kor = 85;
		int eng = 99;
		int mat = 97;

		int total = kor + eng + mat;
		System.out.println("=========성적표============");
		System.out.println(String.format("국어+영어+수학 총점 = %d", total));

		double avg = total / 3;
		System.out.println(String.format("평균 점수 : %f", avg));

		float fAvg = total / 3f;
		System.out.println(String.format("평균 점수(f) : %f", fAvg));

		double dAvg = (double) total / 3;
		System.out.println(String.format("평균 점수(d) : %f", dAvg));
	}
}

//실행 결과
//int 타입 값 출력 : 123456789
//byte 타입 값 출력 : 21
//=========성적표============
//국어+영어+수학 총점 = 281
//평균 점수 : 93.000000
//평균 점수(f) : 93.666664
//평균 점수(d) : 93.666667
