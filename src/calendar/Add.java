package calendar;
import java.util.Scanner;
public class Add {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		int a, b, sum;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
        sum=a+b;
        System.out.println("두 수의 합은 "+sum+"입니다.");
        input.close();
	}

}
