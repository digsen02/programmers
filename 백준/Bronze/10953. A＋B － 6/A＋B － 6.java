import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int T = sc.nextInt ();
        sc.nextLine();
		for (int i = 0; i < T; i ++) {
			String line = sc.nextLine();
			String [] parts = line.split (",");
			int A = Integer.parseInt(parts[0].trim());
			int B = Integer.parseInt(parts[1].trim());
			System.out.println (A + B);
		}
        sc.close();
	}
}