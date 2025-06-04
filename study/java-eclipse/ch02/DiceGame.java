package ch02;
 
class Dice {

	public int getDice() {
		return (int) (Math.random() * 6) + 1;
	}
}

// 주사위 과제
public class DiceGame {

	public static String select = ""; 
	public static int dice1 = 0;
	public static int dice2 = 0;
	
	public static void main(String[] args) {

		doPlay();
	}

	private static void doPlay() {

		UiHandler uiHandler = new UiHandler();
		String input = "";
		var ui = uiHandler.createUi("주사위 게임");

		ui.addDescription("먼저 홀/짝 을 고르고 ");
		ui.addDescription("주사위를 두번 던집니다.");
		ui.addDescription("두 주사위의 합이 홀수인지 짝수인지 맞췄다면 당신의 승리입니다.");
		ui.addMenu("1", "알겠습니다.");
		input = ui.runUi("번호를 입력하세요.");

		doChoice();
	}

	private static void doChoice() {

		UiHandler uiHandler = new UiHandler();
		String input = "";
		var ui = uiHandler.createUi("홀수/짝수 선택하기");

		ui.addDescription("홀수 짝수 중 하나를 선택하세요");
		ui.addMenu("1", "홀수");
		ui.addMenu("2", "짝수");
		input = ui.runUi("번호를 입력하세요.");

		select = input;
		
		doDice();
	}

	private static void doDice() {

		UiHandler uiHandler = new UiHandler();
		String input = "";
		var ui = uiHandler.createUi("주사위 던지기");

		ui.addDescription("첫번째 주사위를 던져주세요");
		ui.addMenu("1", "던진다.");
		input = ui.runUi("번호를 입력하세요.");

		var dice = new Dice();
		dice1 = dice.getDice();

		ui.clear();
		ui.addDescription(String.format("첫번째 주사위의 결과는 ... %d 입니다.", dice1));

		ui.addDescription("두번째 주사위를 던져주세요");
		ui.addMenu("1", "던진다.");
		input = ui.runUi("번호를 입력하세요.");

		dice2 = dice.getDice();

		ui.clear();
		ui.addDescription(String.format("두번째 주사위의 결과는 ... %d 입니다.", dice2));
		ui.addMenu("1", "결과 확인하기");
		input = ui.runUi("번호를 입력하세요.");
		
		doResult();
	}

	private static void doResult() {

		UiHandler uiHandler = new UiHandler();
		String input = "";
		var ui = uiHandler.createUi("게임 결과");
		
		int total = dice1 + dice2;
		String resultOdd = (total % 2 == 0) ? "짝수" : "홀수";
		String selectOdd = (Integer.parseInt(select) % 2 == 0) ? "짝수" : "홀수";
		
		ui.addDescription(String.format("두 주사위의 합은 %d(%s), 당신이 선택한 값은 %s이므로 %s하셨습니다.", total, 
				resultOdd,
				selectOdd,
				resultOdd.equals(selectOdd) ? "승리" : "패배"));
		ui.addMenu("1", "다시하기");
		ui.addMenu("2", "프로그램 종료");
		input = ui.runUi("번호를 입력하세요.");
		
		switch (input) {
		case "1":
			doPlay();
			break;
		case "2":
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		}
	}

}
