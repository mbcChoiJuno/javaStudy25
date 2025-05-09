package ch01;

//캐스팅 테스트 (형변환)
public class IntToFloat {

	public static void main(String[] args) {
		
		doCasting();
	}
	
	public static void doCasting() {
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		System.out.println("num1 : " + num1); // num1 : 123456780
		System.out.println("num2 : " + num2); // num2 : 123456784
		System.out.println("num3 : " + num3); // num3 : 1.23456784E8
		
		System.out.println(String.format(("num1 : %d"), num1));
		System.out.println(String.format(("num2 : %d"), num2));
		System.out.println(String.format(("num3 : %f"), num3));

		int result = num1 - num2;
		System.out.println("float 으로 다녀온 후에 num2 값 변경됨"); // 
		System.out.println("num1 - num2 : " + result); // 
	}
}

//실행결과
//num1 : 123456780
//num2 : 123456784
//num3 : 1.23456784E8
//num1 : 123456780
//num2 : 123456784
//num3 : 123456784.000000
//float 으로 다녀온 후에 num2 값 변경됨
//num1 - num2 : -4
