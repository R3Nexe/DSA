
import java.util.Scanner;

public class HelpfulMath {
                public static void main(String[] args) {
                                Scanner sc = new Scanner(System.in);
                                String s = sc.nextLine();
                                helpfulMaths(s);
                }

                static void helpfulMaths(String s) {
                                String[] nums = s.split("\\+");
                                int n = nums.length;
                                for (int i = 0; i < n - 1; i++) {
                                                for (int j = 0; j < n - i - 1; j++) {
                                                                if (nums[j].compareTo(nums[j + 1]) > 0) {
                                                                                String temp = nums[j];
                                                                                nums[j] = nums[j + 1];
                                                                                nums[j + 1] = temp;
                                                                }
                                                }
                                }
                                String res = "";
                                for (int i = 0; i < nums.length; i++) {
                                                res += nums[i] + "+";
                                }
                                System.out.println(res.substring(0, res.length() - 1));
                }
}
