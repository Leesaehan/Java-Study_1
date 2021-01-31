import java.util.Scanner;

public class If_Exam_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		a = sc.nextInt();
		
		if (a == 1 || a == 3 || a == 5) { System.out.println("enjoy"); }
		else { System.out.println("oops"); }
	}

}
