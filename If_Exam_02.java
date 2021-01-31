import java.util.Scanner;

public class If_Exam_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0, d = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int sum1 = a/b, sum2 = c/d;
		
		if (sum1 > sum2) { System.out.println("1"); }
		
		else if (sum1 < sum2) { System.out.println("-1"); }
		
		else { System.out.println("0"); }
	}

}
