import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] nums = new boolean[30];
        int[] arr = new int[2];
        for (int i = 0; i < 28; i++) {
            nums[sc.nextInt()-1] = true;
        }
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!nums[i]) {
                arr[a] = i+1;
                a++;
            }
        }
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}