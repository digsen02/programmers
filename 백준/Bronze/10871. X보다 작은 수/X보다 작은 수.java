import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		int c = sc.nextInt();
		for (int i = 0; i < a; i ++ ) {
			int d = sc.nextInt();
			b[i] = d;
			
		}
		for (int i = 0; i < a; i ++ ) {
			if ( b[i] - c < 0 ) {
				System.out.println ( b[i] );
			}
		}
	}
}
