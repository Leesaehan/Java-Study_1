import java.util.Scanner;

public class If_Exam_03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		g = sc.nextInt();
		h = sc.nextInt();
		
		
		if (a<b && b<c && c<d && d<e && e<f && f<g && g<h) { 
			System.out.println("ascending"); }
		
		else if (a>b && b>c && c>d && d>e && e>f && f>g && g>h) { 
			System.out.println("descending"); }
		
		else { System.out.println("mixed"); }
	}

}
