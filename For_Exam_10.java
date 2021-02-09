import java.util.Scanner;

public class For_Exam_10 {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		a = sc.nextInt();
		
		for (int i = 0; i <= a-1; i++) {			
			
			if (i == 0) {
				for (int j = 0; j <= a-1; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			else if (i == a-1) {
				for (int j = 0; j <= a-1; j++) {
					System.out.print("*");
				}
			}
			
			else if (i == (a/2)) {
				for (int j = 0; j <= a-1; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
			
			else {
				for (int k = 0; k < a-1; k++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}
}