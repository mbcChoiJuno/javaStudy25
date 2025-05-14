package ch02;

// 업 & 다운 게임 과제
public class UpDownGame {

	private static int MAX_NUMBER = 1000;

	public static void main(String[] args) {

		// 1. 게임 설명
		// 2. 선택된 숫자 공지 + 유저->컴->유저 반복
		// 3. 결과 발표
		doPlayGame();
	}

	private static void doPlayGame() {

		UiHandler uiHandler = new UiHandler();
		var ui = uiHandler.createUi("Up/Down Game");
		ui.addDescription("게임 설명");
		ui.addDescription(String.format("게임이 시작되면 1부터 %d 사이에 무작위로 정답이 결정됩니다.", MAX_NUMBER));
		ui.addDescription("플레이어와 컴퓨터는 번갈아가면서 숫자를 고를 수 있습니다.");
		ui.addDescription("고른 숫자가 정답보다 작으면 Up, 크면 Down을 알려줍니다.");
		ui.addDescription("먼저 정답을 맞춘 플레이어가 승리합니다.");
		ui.runUi("시작(아무키나 입력)");

		gameProcess();
	}

	private static void gameProcess() {
		UiHandler uiHandler = new UiHandler();

		int answer = (int) (Math.random() * MAX_NUMBER) + 1;

		var ui = uiHandler.createUi(" Up & Down ");

		boolean isEndGame = false;
		int turn = 0; // 0:유저 1:컴퓨터

		int prevMin = 1;
		int prevMax = MAX_NUMBER;

		while (isEndGame == false) {

			ui.addDescription(String.format("%d번째 질문", (turn + 1)));
			
			int playerAnswer = 0;
			boolean isUp = false;

			if (turn % 2 == 0) {
				// 유저 턴
				ui.addDescription("당신의 차례");
				playerAnswer = Integer.parseInt(ui.runUi(String.format("(%d~%d)", prevMin, prevMax)));

			} else {
				// 컴퓨터 턴
				ui.addDescription("컴퓨터의 차례");
				playerAnswer = (int)(Math.random() * (prevMax - prevMin)); 
				playerAnswer += prevMin; 
			}
			
			if (playerAnswer == answer) {
				// 게임 종료
				turn++;
				break;
			} else {
				if (playerAnswer > answer) {
					// Down
					prevMax = playerAnswer - 1;
				} else {
					// Up
					isUp = true;
					prevMin = playerAnswer + 1;
				}
			}
			
			ui.clear();
			ui.addDescription(String.format("%d번째 질문", (turn + 1)));
			// ㅁㅁㅁ는 127을 골랐다
			ui.addDescription(String.format("%s는 %d를 골랐다.", (turn % 2 == 0) ? "플레이어" : "컴퓨터", playerAnswer));
			// 127보다 UP!!!
			ui.addDescription(String.format("%d보다 %s!!!", playerAnswer, (isUp) ? "UP" : "DOWN"));
			
			ui.runUi("(아무키나 입력)");

			ui.clear();
			turn++;
		}

		doResult(turn, answer);
	}

	private static void doResult(int turn, int answer) {

		UiHandler uiHandler = new UiHandler();
		var ui = uiHandler.createUi(" Up & Down 결과 ");
		ui.addDescription(String.format("총 질문 수 : %d", turn));
		ui.addDescription(String.format("%d를 찾은 %s의 승리", answer, (turn % 2 == 0) ? "당신" : "컴퓨터"));
		ui.addMenu("1", "다시하기");
		ui.addMenu("0", "프로그램 종료");
		var select = Integer.parseInt(ui.runUi("번호를 입력하세요."));
		
		switch (select) {
		case 1:
			doPlayGame();
			break;
		case 0:
			System.exit(0);
			break;
		}
	}
}
