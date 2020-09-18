package calendar;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal> ";

	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;

		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {// -1이면 빠져나가도록
				break;
			}
			if (month > 12) {
				continue;// continue를 만나면 루프의 처음으로 돌아감
			}
			cal.printCalendar(2020, month);

		}
		System.out.println("Bye.");
		scanner.close();
	}

	public static void main(String[] args) {
		// 앱 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
