package ch02;

import java.util.Scanner;

// 성적처리 과제
public class ExamFix {

	public static void main(String[] args) {

		doExam();
	}

	private static void doExam() {

		Scanner input = new Scanner(System.in);

		System.out.println("이름을 입력하세요.");
		System.out.print(">>> ");
		String name = input.next();
		
		int kor = getInputScore("국어");
		int eng = getInputScore("영어");
		int mat = getInputScore("수학");

		int total = kor + eng + mat;
		System.out.printf("%s님의 총 점수는 %d점 입니다.\n", name, total);

		input = new Scanner(System.in);
		System.out.println("성적표를 보시겠습니까? (y/n)");
		String agree = "";
		while (true) {

			System.out.print(">>> ");
			agree = input.next();

			switch (agree.toLowerCase()) {
			case "y":
				break;
			case "n":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				return;
			default:
				System.out.println("y혹은 n만 입력해주세요.");
				continue;
			}

			break;
		}

		double avg = (double) total / 3;
		char grade = getGrade(avg);

		System.out.printf("%s님의 평균 점수는 %01.01f점 입니다. (등급:%c) ", name, avg, grade);

	}

	private static int getInputScore(String className) {

		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s 점수를 입력하세요.\n", className);
		
		int score = -1;
		while (score == -1) {

			System.out.print(">>> ");
			try {
				String strScore = input.next();
				score = Integer.parseInt(strScore);

			} catch (Exception e) {
				score = -1;
			}

			if (score > 100 || 0 > score) {
				score = -1;
			}

			if (score == -1) {
				System.out.printf("%s 점수는 0~100 사이로만 입력하세요,\n", className);
				
			}
		}

		return score;
	}

	private static char getGrade(double score) {

		char grade = 'E';

		int a = 90;
		int b = 80;
		int c = 70;
		int d = 60;

		if (score >= a) {
			grade = 'A';
		} else if (score >= b) {
			grade = 'B';
		} else if (score >= c) {
			grade = 'C';
		} else if (score >= d) {
			grade = 'D';
		}

		return grade;
	}

}
