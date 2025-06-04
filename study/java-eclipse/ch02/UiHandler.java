package ch02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class UiData {

	private String titleName = "";
	private List<String> descriptions = new ArrayList<String>();
	private List<String> keyList = new ArrayList<String>();
	private List<String> menuList = new ArrayList<String>();

	public UiData(String title) {
		titleName = title;
	}

	private void clearUi() {
		for (int i = 0; i < 50; i++)
			System.out.println();
	}
	
	public void addDescription(String description) {
		descriptions.add(description);
	}
	
	public void addMenu(String key, String menuName) {		
		keyList.add(key);
		menuList.add(String.format("%s. %s", key, menuName));
	}
	
	public String runUi(String inputMsg) {
		Scanner input = new Scanner(System.in);
		
		clearUi();
		
		System.out.println("==================");
		System.out.printf("%s\n", titleName);

		for ( var description : descriptions ) {
			System.out.printf("%s\n", description);
		}
		
		for ( var menu : menuList ) {
			System.out.printf("%s\n", menu);
		}

		System.out.println();

		String inputKey = "";
		System.out.printf("%s\n", inputMsg);
		
		if (keyList.toArray().length == 0) {
			
			System.out.print(">>> ");
			inputKey = input.next();
			
			return inputKey;
		}
			
		boolean hasKey = false;
		while (true) {
			
			System.out.print(">>> ");
			
			inputKey = input.next();
			for ( var key : keyList ) {
				if (inputKey.equalsIgnoreCase(key)) {
					hasKey = true;
				}
			}
			
			if (hasKey) {
				break;
			} else {
				System.out.println("값을 확인하고 다시 입력하세요.");
			}
		}
		
		return inputKey;
	}
	
	public void print(String msg) {
		System.out.print(msg);
	}
	
	public void clear() {
		descriptions.clear();
		keyList.clear();
		menuList.clear();
	}
}

public class UiHandler {

	public UiData createUi(String title) {
		return new UiData(title);
	}

}
