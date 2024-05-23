import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c[] = new int[a];
		for ( int i = 0; i < b; i++ ) {
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			for ( int j = d - 1 ; j <= e - 1 ; j++) {
				c[j] = f ;
			}
		}
		for ( int i = 0; i < a; i++ ) { 
			System.out.println ( c[i] );
		}
	}
}