package ch02;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class LottoData {
	
	private List<Integer> numbers = new ArrayList<Integer>();
	
	public LottoData() {
		var tmpList = new ArrayList<Integer>();

		for (int i = 0; i < 45; i++) {
			tmpList.add(i + 1);
		}
		
		Collections.shuffle(tmpList);
		
		for (int i = 0; i < 6; i++) {
			numbers.add(tmpList.get(i));
		}

		Collections.sort(numbers);
	}

	public String toString() {
		String str = "";
		
		for (var number : numbers) {
			str += String.format("%02d", number);
			str += " ";
		}
		return str;
	}
}

// 로또 과제
public class LottoProvider {

	public static void main(String[] args) {

		doGenerate();
	}

	private static void doGenerate() {
		UiHandler uiHandler = new UiHandler();
		var ui = uiHandler.createUi("로또 번호 생성기");
		
		ui.addDescription("로또 번호를 생성합니다.");
		var input = ui.runUi("원하는 조합 개수를 입력하세요.");
		
		var count = Integer.parseInt(input);
		
		for (int i = 0; i < count; i++) {
			var lotto = new LottoData();
			System.out.println(String.format("%d번 조합 : %s", (i+1), lotto.toString()));
		}
	}
}
