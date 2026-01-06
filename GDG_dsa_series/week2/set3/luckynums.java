import java.util.Scanner;

public class luckynums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = -1;
        int[] luckynums = { 4, 7, 47, 447, 477, 744, 474, 747, 774, 777, 444 };
        for (int i : luckynums) {
            if (num % i == 0) {
                flag = 0;
                System.out.println("YES");
                break;
            }
        }
        if (flag == -1) System.out.println("NO");
    }
}
