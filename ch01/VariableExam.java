package ch01;

//���� ���� ����
public class VariableExam {

	public static void main(String[] args) {

		int mach;
		int distance;
		mach = 340;
		distance = mach * 60 * 60; // ���� m/s
		
		System.out.println("�Ҹ��� 1�ð� ���� ���� �Ÿ�");
		System.out.println(distance + "m");

		double radius; // �Ǽ� Ÿ���� radius ���� ����
		double area; // �Ǽ� Ÿ���� area ���� ����
		// �Ǽ�Ÿ���� �Ҽ����� �ִ�
		
		radius = 10; // �ʱⰪ�� ���������� �Ǽ�Ÿ������ �����
		area = radius * radius *3.14;
		System.out.print("�������� " + radius + " ��");
		System.out.println(" ���� ���� : " + area);
	}

}

//������
//�Ҹ��� 1�ð� ���� ���� �Ÿ�
//1224000m
//�������� 10.0 �� ���� ���� : 314.0