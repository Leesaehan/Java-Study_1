import java.util.Scanner;

public class If_Exam_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0;
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) { System.out.println(">"); }
		
		else if (a < b) { System.out.println("<"); }
		
		else { System.out.println("="); }
	}

}