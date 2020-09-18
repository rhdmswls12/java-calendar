package calendar;
import java.util.Scanner;

/**
 * -새로운 클래스 추가
 * -월을 입력하면 해당월의 달력을 출력한다.
 * -달력모양은 이전에 작성한 모양으로 만든다.
 * -1일은 일요일로 정해도 무방하다.
 * --1일을 입력받기 전까지 반복입력 받는다.
 * -프롬프트를 출력한다.
 */
public class Calendar {
	private static final int[] MAX_DAYS= {31,28,31,30,31,30,31,31,30,31,30,31};
	public int maxDaysofMonth(int month) {	
		return MAX_DAYS[month-1];
	}
	public void printCalendar(int year,int month) {
		System.out.printf("   << %4d년%3d월 >>\n",year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");
		
		int maxDay=maxDaysofMonth(month);
		for(int i=1;i<=maxDay;i++) {
			System.out.printf("%3d",i);
			if(i%7==0) {
				System.out.println();
			}
		}
		System.out.println();

	}

	
}
