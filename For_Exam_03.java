import java.util.Scanner;

public class For_Exam_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0;
		int small = 0, big = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();		
		
		if (a < b) { big = b; small = a; }
		
		else { big = a; small = b; }

		
		for (int i = small; i <= big; i++) {
			System.out.print(i + " ");
		}

	}

}
