package ch03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * main 클래스 아님
 * 자판기 아이템(상품) 클래스
 * 
 * @author 10-2
 *
 */
class VendingItem {

	private String name = ""; // 상품명
	private int price = 0; // 판매가

	public VendingItem() {
	}

	public VendingItem(String name, int price) {
		this.setName(name);
		this.setPrice(price);
	}

	public boolean isVending() {
		return !name.equals("");
	}

	public String getName() {

		if (name.equals("")) {
			return "빈 테이블";
		}
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public int getPrice() {

		return price;
	}

	public void setPrice(int price) {

		this.price = price;
	}
}

/**
 * 자판기 과제
 * 
 * @author 10-2
 *
 */
public class Vending {

	// 관리자 계정
	private static final String ADMIN_ID = "admin";
	private static final String ADMIN_PASSWORD = "1234";

	// 자판기 아이템 배열
	private static VendingItem[][] vendingTables = new VendingItem[3][4];

	// 사용자의 충전금
	private static int userCash = 0; // 사용자 충전금

	// 구매시 기록용 리스트 배열
	private static List<VendingItem> buyHistoryList = new ArrayList<VendingItem>();

	// 스캐너 전역처리
	private static Scanner in = new Scanner(System.in);

	// ASCII Art 허전해서 넣음
	private static void displaySplash() {

		System.out.println("\r\n"
				+ "   :::     :::       ::::::::::       ::::    :::       :::::::::       :::::::::::       ::::    :::       :::::::: \r\n"
				+ "  :+:     :+:       :+:              :+:+:   :+:       :+:    :+:          :+:           :+:+:   :+:      :+:    :+: \r\n"
				+ " +:+     +:+       +:+              :+:+:+  +:+       +:+    +:+          +:+           :+:+:+  +:+      +:+         \r\n"
				+ "+#+     +:+       +#++:++#         +#+ +:+ +#+       +#+    +:+          +#+           +#+ +:+ +#+      :#:          \r\n"
				+ "+#+   +#+        +#+              +#+  +#+#+#       +#+    +#+          +#+           +#+  +#+#+#      +#+   +#+#    \r\n"
				+ "#+#+#+#         #+#              #+#   #+#+#       #+#    #+#          #+#           #+#   #+#+#      #+#    #+#     \r\n"
				+ " ###           ##########       ###    ####       #########       ###########       ###    ####       ########       \r\n"
				+ "");

		System.out.println("\r\n"
				+ "        :::   :::           :::        ::::::::       :::    :::       :::::::::::       ::::    :::       :::::::::: \r\n"
				+ "      :+:+: :+:+:        :+: :+:     :+:    :+:      :+:    :+:           :+:           :+:+:   :+:       :+:         \r\n"
				+ "    +:+ +:+:+ +:+      +:+   +:+    +:+             +:+    +:+           +:+           :+:+:+  +:+       +:+          \r\n"
				+ "   +#+  +:+  +#+     +#++:++#++:   +#+             +#++:++#++           +#+           +#+ +:+ +#+       +#++:++#      \r\n"
				+ "  +#+       +#+     +#+     +#+   +#+             +#+    +#+           +#+           +#+  +#+#+#       +#+            \r\n"
				+ " #+#       #+#     #+#     #+#   #+#    #+#      #+#    #+#           #+#           #+#   #+#+#       #+#             \r\n"
				+ "###       ###     ###     ###    ########       ###    ###       ###########       ###    ####       ##########       \r\n"
				+ "");
	}

	/**
	 * 기능함수 
	 * 자판기 데이터 초기세팅
	 */
	private static void initTable() {

		// 초기화
		for (int i = 0; i < vendingTables.length; i++) {
			for (int j = 0; j < vendingTables[i].length; j++) {

				vendingTables[i][j] = new VendingItem();
			}
		}

		// 자판기 초기 데이터
		updateTable(1, "신라면", 1600);
		updateTable(2, "삼양라면", 1500);
		updateTable(3, "불닭볶음면", 1800);
		updateTable(4, "짜파게티", 2000);
		updateTable(5, "진라면", 1400);
	}

	/**
	 * 프로그램 시작시 호출됨
	 */
	public static void main(String[] args) {

		displaySplash();

		initTable();
		onStart();
	}

	/**
	 * 프로그램 시작
	 */
	private static void onStart() {

		gotoSelectScenePage();
	}

	/**
	 * 기능함수
	 * 자판기 현재 상태를 Console로 표시
	 */
	private static void showTable() {

		int rows = vendingTables.length; // 3
		int cols = vendingTables[0].length; // 4

		System.out.println("=================================================================================");
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				var table = vendingTables[i][j];
				int tableNumber = (j + 1) + (i * cols);

				String menuContent = "";
				if(table.isVending()) {
					menuContent = String.format("% 3d. %s [%d원]", tableNumber, table.getName(), table.getPrice());
				} else {
					menuContent = String.format("% 3d. %s", tableNumber, table.getName());
				}

				System.out.printf("%-20s |", menuContent);
			}
			System.out.println();
		}
		
		System.out.println("=================================================================================");
		System.out.println();
	}

	/**
	 * 기능함수 
	 * 자판기 번호 입력받을 시 자판기 아이템 참조를 위한 함수
	 */
	private static VendingItem getTable(int tableNumber) {

		int colsCount = vendingTables[0].length;
		int rows = (tableNumber - 1) / colsCount;
		int cols = (tableNumber - 1) % colsCount;

		return vendingTables[rows][cols];
	}

	/**
	 * 기능함수 
	 * 구매 히스토리 참조하여 전체 수익 조회
	 */
	private static int getTotalIncome() {

		int totalIncome = 0;

		for (var history : buyHistoryList) {
			totalIncome += history.getPrice();
		}

		return totalIncome;
	}

	/**
	 * 기능함수 
	 * 자판기 아이템 등록 함수
	 */
	private static void createTable(int tableNumber, String name, int price) {

		int colsCount = vendingTables[0].length;
		int rows = (tableNumber - 1) / colsCount;
		int cols = (tableNumber - 1) % colsCount;

		vendingTables[rows][cols] = new VendingItem(name, price);
	}

	/**
	 * 기능함수 
	 * 자판기 아이템 수정 함수
	 */
	private static void updateTable(int tableNumber, String name, int price) {

		int colsCount = vendingTables[0].length;
		int rows = (tableNumber - 1) / colsCount;
		int cols = (tableNumber - 1) % colsCount;

		vendingTables[rows][cols].setName(name);
		vendingTables[rows][cols].setPrice(price);
	}

	/**
	 * 기능함수 
	 * 자판기 아이템 삭제 함수
	 */
	private static void deleteTable(int tableNumber) {

		int colsCount = vendingTables[0].length;
		int rows = (tableNumber - 1) / colsCount;
		int cols = (tableNumber - 1) % colsCount;

		vendingTables[rows][cols] = new VendingItem();
	}

	/**
	 * 기능함수 
	 * 관리자 검증용 로그인 시도
	 */
	private static boolean performLogin(String id, String pw) {

		return (id.equals(ADMIN_ID) && pw.equals(ADMIN_PASSWORD));
	}

	/**
	 * 기능함수 
	 * 사용자가 아이템 구매할때 호출
	 */
	private static void buyItem(VendingItem product) {

		userCash -= product.getPrice();
		buyHistoryList.add(product);
	}

	/**
	 * 기능함수 
	 * 잘못된 입력 받을 시 예외 메세지 표시
	 */
	private static void badInputException() {

		System.out.println("[System] 입력값을 확인하고 다시 입력하세요");
	}

	/**
	 * 기능함수
	 * 숫자가 입력될때까지 스캐너 next 호출
	 * @return
	 */
	private static Integer inNextIntLoop() {

		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		while (run) {
			
			try {
				return Integer.parseInt(scanner.next());
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요.");
				System.out.print(">>>");
			} 
		}
		
		return null;
	}
	
	/**
	 * 기능함수
	 * y, n 입력될때까지 스캐너 next 호출
	 * @return
	 * true: y / false: n
	 */
	private static boolean inNextYnLoop() {
		
		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		while (run) {
			
			switch (scanner.next()) {
				case "y", "Y" -> {
					return true;
				}
				case "n", "N" -> {
					return false;
				}
				default -> {
					System.out.println("y, n 으로 입력하세요.");
					System.out.print(">>>");
				}
			}
		}
		
		return false;
	}

	/**
	 * 기능함수
	 * 테이블 번호가 안전한 배열인지 확인
	 * 
	 * @param tableNumber
	 * @return
	 */
	private static boolean isSafeArray(int tableNumber) {

		int colsCount = vendingTables[0].length;
		int rows = (tableNumber - 1) / colsCount;
		int cols = (tableNumber - 1) % colsCount;

		return tableNumber >= 0 && (vendingTables.length >= rows && vendingTables[0].length >= cols);
	}

	/**
	 * UI 
	 * 관리자/사용자 선택 페이지로 이동
	 */
	private static void gotoSelectScenePage() {

		boolean run = true;

		while (run) {

			// UI
			System.out.println("1. 관리자 페이지");
			System.out.println("2. 자판기 작동");
			System.out.println("9. 프로그램 종료");

			// Input
			System.out.println("원하는 메뉴 번호를 입력하세요.");
			System.out.print(">>>");
			var select = in.next();
			System.out.println();

			// Controller
			switch (select) {
			case "1" -> gotoCheckAdminPage();
			case "2" -> gotoVendingPage();
			case "9" -> run = false;
			default -> badInputException();
			}

			System.out.println();
		}

		System.out.println("프로그램이 종료되었습니다.");
		System.exit(0);
	}

	/**
	 * UI 
	 * 관리자 
	 * 검증 페이지로 이동
	 */
	private static void gotoCheckAdminPage() {

		// UI
		System.out.println("################");
		System.out.println("##### 자판기 #####");
		System.out.println("################");
		System.out.println("[System] 관리 페이지에 진입하였습니다.");

		// Input
		System.out.print("관리자 ID :");
		var id = in.next();

		System.out.print("관리자 패스워드 :");
		var pw = in.next();
		System.out.println();

		// 로그인 검증
		boolean onSuccessLogin = performLogin(id, pw);

		if (onSuccessLogin) { // 관리자 페이지 접근
			gotoAdminPage();

		} else { // 실패
			System.out.println("[System] 관리자 계정 또는 암호가 다릅니다.");
			System.out.println();
		}
	}

	/**
	 * UI 
	 * 관리자 
	 * 전용 페이지로 이동
	 */
	private static void gotoAdminPage() {

		boolean run = true;

		while (run) {

			// UI
			System.out.println("[System] 관리자 권한 확인됨.");
			System.out.println("1. 상품 관리");
			System.out.println("2. 수익 관리");
			System.out.println("9. 돌아가기");

			// Input
			System.out.println("원하는 메뉴 번호를 입력하세요.");
			System.out.print(">>>");
			var select = in.next();
			System.out.println();

			// Controller
			switch (select) {
			case "1" -> gotoProductPage();
			case "2" -> gotoIncomePage();
			case "9" -> run = false;
			default -> badInputException();
			}

			System.out.println();
		}
	}

	/**
	 * UI 
	 * 관리자 
	 * 상품 관리 페이지로 이동
	 */
	private static void gotoProductPage() {

		boolean run = true;

		while (run) {

			// UI
			System.out.println("################");
			System.out.println("상품 관리 페이지 입니다");
			System.out.println("################");
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴 조회");
			System.out.println("3. 메뉴 수정");
			System.out.println("4. 메뉴 삭제");
			System.out.println("9. 돌아가기");

			// Input
			System.out.println("원하는 메뉴 번호를 입력하세요.");
			System.out.print(">>>");
			var select = in.next();
			System.out.println();

			// Controller
			switch (select) {
			case "1" -> gotoCreateMenuPage();
			case "2" -> gotoReadMenuPage();
			case "3" -> gotoUpdateMenuPage();
			case "4" -> gotoDeleteMenuPage();
			case "9" -> run = false;
			default -> badInputException();
			}

			System.out.println();
		}
	}

	/**
	 * UI 
	 * 관리자 
	 * 상품 관리-상품 등록 페이지로 이동
	 */
	private static void gotoCreateMenuPage() {

		boolean run = true;

		while (run) {

			// UI
			showTable();

			// Input
			System.out.println("상품을 등록할 테이블 번호를 입력하세요");
			System.out.println("중지하려면 exit를 입력하세요.");
			System.out.print(">>>");
			var input = in.next();
			System.out.println();

			if (input.equals("exit")) {
				break;
			}

			var tableNumber = 0;

			try {
				tableNumber = Integer.parseInt(input);
			} catch (Exception e) {
				badInputException();
				System.out.println();
				continue;
			}

			if (isSafeArray(tableNumber) == false) {
				System.out.println("[System] 테이블 범위 밖입니다.");
				System.out.println();
				continue;
			}

			if (getTable(tableNumber).isVending()) {
				System.out.println("[System] 이미 등록된 상품이 있습니다.");
				System.out.println();
				continue;
			}

			System.out.printf("현재 선택된 번호:%d\n", tableNumber);
			System.out.printf("%d번에 진열할 상품명:", tableNumber);
			var name = in.next();
			System.out.printf("%s의 가격 (판매가격):", name);
			var price = Integer.parseInt(in.next());

			// 처리
			createTable(tableNumber, name, price);
			System.out.println("등록 완료");

			System.out.println();
			run = false;
		}
	}

	/**
	 * UI 
	 * 관리자 
	 * 상품 관리-상품 조회 페이지로 이동
	 */
	private static void gotoReadMenuPage() {

		// UI
		showTable();
	}

	/**
	 * UI 
	 * 관리자 
	 * 상품 관리-상품 수정 페이지로 이동
	 */
	private static void gotoUpdateMenuPage() {

		boolean run = true;

		while (run) {

			// UI
			showTable();

			// Input
			System.out.println("상품을 수정할 테이블 번호를 입력하세요");
			System.out.println("중지하려면 exit를 입력하세요.");
			System.out.print(">>>");
			var input = in.next();
			System.out.println();

			if (input.equals("exit")) {
				break;
			}

			var tableNumber = 0;

			try {
				tableNumber = Integer.parseInt(input);
			} catch (Exception e) {
				badInputException();
				System.out.println();
				continue;
			}

			if (isSafeArray(tableNumber) == false) {
				System.out.println("[System] 테이블 범위 밖입니다.");
				System.out.println();
				continue;
			}

			if (getTable(tableNumber).isVending() == false) {
				System.out.println("빈 테이블입니다.");
				System.out.println();
				continue;
			}

			var vendingItem = getTable(tableNumber);

			System.out.printf("현재 선택된 번호:%d\n", tableNumber);
			System.out.printf("%s >>> 수정할 상품명:", vendingItem.getName());
			var name = in.next();

			System.out.printf("%d >>> 수정할 판매가격:", vendingItem.getPrice());
			int price = inNextIntLoop();
			
			// 처리
			updateTable(tableNumber, name, price);
			System.out.println("수정 완료되었습니다.");

			System.out.println();
			run = false;
		}
	}

	/**
	 * UI 
	 * 관리자 
	 * 상품 관리-상품 삭제 페이지로 이동
	 */
	private static void gotoDeleteMenuPage() {

		boolean run = true;

		while (run) {

			// UI
			showTable();

			// Input
			System.out.println("상품을 삭제할 테이블 번호를 입력하세요");
			System.out.println("중지하려면 exit를 입력하세요.");
			System.out.print(">>>");
			var input = in.next();
			System.out.println();

			if (input.equals("exit")) {
				break;
			}

			var tableNumber = 0;

			try {
				tableNumber = Integer.parseInt(input);
			} catch (Exception e) {
				badInputException();
				System.out.println();
				continue;
			}

			if (isSafeArray(tableNumber) == false) {
				System.out.println("[System] 테이블 범위 밖입니다.");
				System.out.println();
				continue;
			}

			if (getTable(tableNumber).isVending() == false) {
				System.out.println("빈 테이블입니다.");
				System.out.println();
				continue;
			}

			System.out.printf("현재 선택된 번호:%d\n", tableNumber);
			System.out.printf("%d번에 진열할 상품명:", tableNumber);

			// Input 2
			System.out.println("삭제 하시겠습니까? (y/n)");
			System.out.print(">>>");

			// Controller
			if(inNextYnLoop()) {
				// 처리
				deleteTable(tableNumber);
				System.out.println("삭제 완료");
			} 

			System.out.println();
			run = false;
		}
	}

	/**
	 * UI 
	 * 관리자 
	 * 수익관리 페이지로 이동
	 */
	private static void gotoIncomePage() {

		boolean run = true;

		while (run) {

			// UI
			System.out.println("################");
			System.out.println("수익 관리 페이지 입니다");
			System.out.println("################");
			System.out.println("1. 전체 수익 조회");
			System.out.println("2. 구매기록 조회");
			System.out.println("9. 돌아가기");

			// Input
			System.out.println("원하는 메뉴 번호를 입력하세요.");
			System.out.print(">>>");
			var select = in.next();
			System.out.println();

			// Controller
			switch (select) {
			case "1" -> gotoReadIncomePage();
			case "2" -> gotoIncomeHistoryPage();
			case "9" -> run = false;
			default -> badInputException();
			}

			System.out.println();
		}
	}

	/**
	 * UI 
	 * 관리자 
	 * 수익관리-영수증조회 페이지로 이동
	 */
	private static void gotoIncomeHistoryPage() {

		if (buyHistoryList.toArray().length == 0) {
			System.out.println("[System] 판매된 물건이 없습니다.");
			return;
		}

		// UI
		System.out.println("[판매된 목록]");

		int index = 1;
		for (var buyHistory : buyHistoryList) {
			var name = String.format("%d. %s", index, buyHistory.getName());
			var price = buyHistory.getPrice();

			var historyLine = String.format("%s\n % 20d\n", name, price);
			System.out.printf("%s\n", historyLine);

			index++;
		}

		System.out.println();
	}

	/**
	 * UI 
	 * 관리자 
	 * 수익관리-총 수익 조회 페이지로 이동
	 */
	private static void gotoReadIncomePage() {

		// UI
		var income = getTotalIncome();
		System.out.printf("현재까지 전체 수익은 %d원 입니다.\n", income);

		System.out.println();
	}

	/**
	 * UI 
	 * 사용자 
	 * 자판기 사용 페이지로 이동
	 */
	private static void gotoVendingPage() {

		boolean run = true;

		while (run) {

			// UI
			System.out.printf("################ 잔액: %d원\n", userCash);
			System.out.println("##### 자판기 ############");
			System.out.println("#######################");
			showTable();
			System.out.println("=======================");
			System.out.println("1. 입금");
			System.out.println("2. 상품 구매");
			System.out.println("3. 잔돈 꺼내기");
			System.out.println("9. 관리자 메뉴");

			// Input
			System.out.println("원하는 메뉴 번호를 입력하세요.");
			System.out.print(">>>");
			var select = in.next();
			System.out.println();

			// Controller
			switch (select) {
			case "1" -> gotoDepositCashPage();
			case "2" -> gotoBuyPage();
			case "3" -> gotoChangeCashPage();
			case "9" -> run = false;
			default -> badInputException();
			}

			System.out.println();
		}
	}

	/**
	 * UI 
	 * 사용자 
	 * 금액 충전 페이지로 이동
	 */
	private static void gotoDepositCashPage() {

		boolean run = true;
		while (run) {
			// Input
			System.out.println("입금할 금액을 입력하세요");
			System.out.printf("현재 잔액: %d원\n", userCash);
			System.out.println("중지하려면 exit를 입력하세요.");
			System.out.print(">>>");
			var input = in.next();
			System.out.println();

			if (input.equals("exit")) {
				break;
			}

			var putInCash = 0;

			try {
				putInCash = Integer.parseInt(input);
			} catch (Exception e) {
				badInputException();
				System.out.println();
				continue;
			}

			userCash += putInCash;
			System.out.println();
			run = false;
		}
	}

	/**
	 * UI 
	 * 사용자 
	 * 자판기 구매 페이지로 이동
	 */
	private static void gotoBuyPage() {

		boolean run = true;

		while (run) {

			// UI
			System.out.printf("################ 잔액: %d원\n", userCash);
			showTable();

			// Input
			System.out.println("구매할 상품의 테이블 번호를 입력하세요");
			System.out.println("중지하려면 exit를 입력하세요.");
			System.out.print(">>>");
			var input = in.next();
			System.out.println();

			if (input.equals("exit")) {
				break;
			}

			var tableNumber = 0;

			try {
				tableNumber = Integer.parseInt(input);
			} catch (Exception e) {
				badInputException();
				System.out.println();
				continue;
			}

			if (isSafeArray(tableNumber) == false) {
				System.out.println("[System] 테이블 범위 밖입니다.");
				System.out.println();
				continue;
			}

			if (getTable(tableNumber).isVending() == false) {
				System.out.println("빈 테이블입니다.");
				System.out.println();
				continue;
			}

			var product = getTable(tableNumber);

			System.out.printf("현재 선택된 번호:%d\n", tableNumber);
			System.out.printf("상품명:%s", product.getName());
			System.out.printf("가격:%d원", product.getPrice());

			// Input 2
			System.out.println("구매 하시겠습니까? (y/n)");
			System.out.print(">>>");

			// Controller
			if(inNextYnLoop()) {
				// 처리
				if (userCash >= product.getPrice()) {
					int tmpCash = userCash;

					buyItem(product);
					System.out.println("구매 완료");
					System.out.printf("%d원에서 %d원 차감되어 %d원이 남았습니다.\n", tmpCash, product.getPrice(), userCash);
				} else {
					System.out.printf("잔액이 %d원 부족합니다.\n", (product.getPrice() - userCash));
					System.out.println();
					continue;
				}
			} 

			System.out.println();
			run = false;
		}
	}
	
	/**
	 * UI 
	 * 사용자 
	 * 잔돈꺼내기 페이지로 이동
	 */
	private static void gotoChangeCashPage() {
		
		// UI
		if (0 >= userCash) {
			System.out.println("거스를 돈이 없습니다.");
			System.out.println();
			return;
		}

		System.out.printf("현재 잔액: %d원\n", userCash);

		// Input 2
		System.out.println("잔돈을 받으시겠습니까? (y/n)");
		System.out.print(">>>");

		// Controller
		if(inNextYnLoop()) {
			// 처리
			System.out.printf("잔돈 %d원을 받았습니다.\n", userCash);
		}
	}
}
