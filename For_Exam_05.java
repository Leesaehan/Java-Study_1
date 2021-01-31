import java.util.Scanner;

public class For_Exam_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0, sum = 0;

		for (int i = 0; i < 7; i++) {
			a = sc.nextInt();
			sum += a;
		}
		
		System.out.print(sum);

	}

}
