
import java.util.Arrays;
import java.util.Scanner;
public class Twins {
                static int twins(int num, String values) {
                                String[] coinsStr = values.split("\\s+");
                                int[] coins = new int[num];
                                int sum = 0;
                                for (int i = 0; i < num; i++) {
                                                coins[i] = Integer.parseInt(coinsStr[i]);
                                                sum += coins[i];
                                }

                                Arrays.sort(coins);
                                int strictSum = 0;
                                int count = 0;
                                for (int i = num - 1; i >= 0; i--) {
                                                strictSum += coins[i];
                                                count++;

                                                if (strictSum > sum / 2) {
                                                                return count;
                                                }
                                }
                                return count;
                }

                public static void main(String[] args) {
                                Scanner sc = new Scanner(System.in);
                                int n= sc.nextInt();
                                sc.nextLine();
                                String s = sc.nextLine();
                                System.out.println(twins(n, s));
                }
}
