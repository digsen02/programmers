import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if (M - 45 < 0 ) {
			if (H - 1 < 0 ) {
				H = 23;
				System.out.println ( H );
				System.out.println ((60 + (M - 45)));
			} else if (H - 1 >= 0) {
				System.out.println ( H - 1 );
				System.out.println ((60 + (M - 45)));
			}
		} else if (M - 45 >= 0) {
			System.out.println (H);
			System.out.println (M - 45);
		}
	}
}