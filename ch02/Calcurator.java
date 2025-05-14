package ch02;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

// 계산기 과제
public class Calcurator {

	private static List<String> recentList = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		powerOnCalcurator();
	}

	private static int getMultipleValue(int x, int y) {
		return x * y;
	}
	
	private static double getDivideValue(int x, int y) {
		return (double)x / (double)y;
	}
	
	private static int getSumValue(int x, int y) {
		return x + y;
	}

	private static int getSubValue(int x, int y) {
		return x - y;
	}

	private static void clearUi() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}
	
	private static void powerOnCalcurator() {
		
		Scanner in = new Scanner(System.in);
		
		while (true) {

			clearUi();
			
			if (recentList.toArray().length > 0) {
				System.out.println("[최근 계산결과]");
				for ( var recent : recentList ) {
					System.out.println(recent);
				}
			}
			
			System.out.println();
			System.out.println("=====계산기=====");
			System.out.println("계산 식을 입력하세요 (+, -, x, / 만 사용)");
			System.out.printf("(ex. %d+%d) >>> ", (int)(Math.random()*20), (int)(Math.random()*20));

			double result = 0;
			String resultString = "";
			
			var formula = in.next();
			
			var multiLogic = formula.split("x");
			var divideLogic = formula.split("\\/");
			String[] sumLogic = formula.split("\\+");
			var subLogic = formula.split("\\-");

			int logicCount = 0;
			int logicType = 0; // 1:곱 2:나 3:더 4:빼

			if (multiLogic.length > 1) {
				logicCount++;
				logicType = 1;
			}
			if (divideLogic.length > 1) {
				logicCount++;
				logicType = 2;
			}
			if (sumLogic.length > 1) {
				logicCount++;
				logicType = 3;
			}
			if (subLogic.length > 1) {
				logicCount++;
				logicType = 4;
			}
			
			if (logicCount == 1) {

				switch (logicType) {
				case 1: 
					result = getMultipleValue(Integer.parseInt(multiLogic[0]), Integer.parseInt(multiLogic[1]));
					resultString = String.format("결과 : %s=%d", formula.replace("=", ""), Math.round(result));
					System.out.printf(resultString);
					break;
				case 2:
					result = getDivideValue(Integer.parseInt(divideLogic[0]), Integer.parseInt(divideLogic[1]));
					resultString = String.format("결과 : %s=%f", formula.replace("=", ""), result);
					System.out.printf(resultString);
					break;
				case 3:
					result = getSumValue(Integer.parseInt(sumLogic[0]), Integer.parseInt(sumLogic[1]));
					resultString = String.format("결과 : %s=%d", formula.replace("=", ""), Math.round(result));
					System.out.printf(resultString);
					break;
				case 4:
					result = getSubValue(Integer.parseInt(subLogic[0]), Integer.parseInt(subLogic[1]));
					resultString = String.format("결과 : %s=%d", formula.replace("=", ""), Math.round(result));
					System.out.printf(resultString);
					break;
				}
				
				recentList.add(resultString);

			} else {
				System.out.println("부등호를 1개 사용하세요.");
				System.out.println();
			}
		}
	}

}
