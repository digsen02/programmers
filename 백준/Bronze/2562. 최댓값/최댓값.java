import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b[] = new int[9];
		int c = 0;
		for (int i = 0; i < 9; i ++ ) {
			int d = sc.nextInt();
			b[i] = d;
		}
		int max = b[0];
		for (int i = 0; i < 9; i ++ ) {
			if ( b[i] >= max ) {
				c = i+1;
				max = b[i];
			}
		}
		System.out.println (max);
		System.out.println (c);
	}
}