import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		int scNum_1 = sc.nextInt();
		int scNum_2 = sc.nextInt();
		int a = 0;
		int b =0;
		int boxNum = 0;
		int[] Array_1 = new int [scNum_1];
		
		for (int i = 0; i < scNum_1; i++) {
			Array_1[i] = i + 1;
		}
		for (int i = 0; i < scNum_2; i++) {
			a = sc.nextInt() - 1;
			b = sc.nextInt() - 1;
			boxNum = Array_1[a];
			Array_1[a] = Array_1[b];
			Array_1[b] = boxNum;
		}
		for (int i = 0; i < scNum_1; i++) {
			System.out.print (Array_1[i] + " " );
		}
	}
}