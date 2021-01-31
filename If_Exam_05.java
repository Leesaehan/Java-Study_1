import java.util.Scanner;

public class If_Exam_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = 0, e = 0, c = 0;
		
		r = sc.nextInt();
		e = sc.nextInt();
		c = sc.nextInt();
		
		int sum = e-c;
		
		if (sum > r) { System.out.println("advertise"); }
		else if (sum < r) { System.out.println("do not advertise"); }
		else { System.out.println("dose not matter"); }
	}

}
