package ch01;

// ��� ������ �׽�Ʈ
public class OperationExam {

	public static void main(String[] args) {
		
		// ���� �׽�Ʈ
		int x = 10;
		x++;
		System.out.println("10�� ++ ���� ���� : " + x);
		x--;
		System.out.println("x�� -- ���� ���� : " + x);
		
		
		// ���� �׽�Ʈ
		int y = 20;
		int result = x+ y;
		System.out.println(result);
		
		
		// ���� �׽�Ʈ
		boolean isBig = (result > 10) ? true : false;
		System.out.println(isBig);
		
		String strResult = (result > 50) ? "ũ��" : "�۴�";
		System.out.println(strResult);
		
		int x1 = 10 * 10;
		System.out.println("10x10="+x1);
		
		int x2 = 10 / 3;
		System.out.println("10/5="+x2);
		
		int x3 = 10 % 3;
		System.out.println("10%5="+x3);
		
		
		//�̼� 3�� �����ڸ� ����Ͽ� Ȧ¦ ����� �غ���
		// Ȧ�� ¦�� �����ϱ�
		int inputNumber = 11;
		String strEven = ((inputNumber % 2) == 0 ? "¦��" : "Ȧ��");
		System.out.println(String.format("%d = %s",  inputNumber, strEven));
		
		
		//�̼� 3�� �����ڸ� ����Ͽ� 4�� ����� ã�ƺ���
		// n�� ��� �����ϱ�
	    int multiple = 4;
		
		int inputNumber2 = 24;
		String resultMultiple = (inputNumber2 % multiple == 0) ? "����" : "�ƴ�";
		
		System.out.println(inputNumber2 + " = " + multiple + "�� ��� " + resultMultiple);
		
		
		// ���������� �׽�Ʈ
		System.out.println("------------- ���� ������ ��ġ�� ���� ��� -----------");
		int a = 10;
		a++;
		++a;
		System.out.println("10 -> a++ -> ++a�� ��� : " + a);

		int b = 10;
		b--;
		--b;
		System.out.println("10 -> b-- -> --b�� ��� : " + b); // 8
		
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

//������
//10�� ++ ���� ���� : 11
//x�� -- ���� ���� : 10
//30
//true
//�۴�
//10x10=100
//10/5=3
//10%5=1
//11 = Ȧ��
//24 = 4�� ��� ����
//------------- ���� ������ ��ġ�� ���� ��� -----------
//10 -> a++ -> ++a�� ��� : 12
//10 -> b-- -> --b�� ��� : 8
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