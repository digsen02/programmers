import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < a; i ++ ) {
			int d = sc.nextInt();
			b[i] = d;
		}
		int max = b[0];
		int unmax = b[0];
		for (int i = 1; i < a; i ++ ) {
			if ( b[i] < unmax ) {
				unmax = b[i];
			}
			if ( b[i] > max ) {
				max = b[i];
			}
		}
		System.out.println (unmax);
		System.out.println (max);
	}
}