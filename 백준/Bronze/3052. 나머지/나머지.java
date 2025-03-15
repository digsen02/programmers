import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a = in.nextInt();
            for (int j = 0; j < 10; j++) {
                if (!list.contains(a % 42)) {
                    list.add(a % 42);
                }
            }
        }
        System.out.println(list.size());
    }
}