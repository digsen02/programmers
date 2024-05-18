import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		int a = 0;
		int H = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		if ( M + C >= 60 ) {
			a = ( M  + C ) / 60;
			if ( H + a >= 24 ) {
				H =  H + ( a - 24 );
				if (M + C % 60 == 0 ) {
					System.out.println ( ( H ) + " " + "0" );
				} else if ( M + C % 60 != 0 ) {
					M += C;
					for (int i = 1 ;  i <= a; i ++ ) {
						M -= 60;
					}
				System.out.println ( ( H ) + " " + M );
				}
			} else {
				if (M + C % 60 == 0 ) {
					System.out.println ( ( H + a ) + " " + "0" );
				} else if ( M + C % 60 != 0 ) {
					M += C;
					for (int i = 1 ;  i <= a; i ++ ) {
						M -= 60;
					}
				System.out.println ( ( H + a ) + " " + M );
				}
			}
		} else if (M + C < 60 ) {
			System.out.println ( H + " " + (M + C) );
		}
	}
}