import java.util.HashSet;
import java.util.Scanner;

public class Anton_and_letters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        for (int i = 1; i < input.length() - 1; i++) {
            if (Character.isLetter(input.charAt(i))) set.add(input.charAt(i));
        }
        int count = set.size();
        System.out.println(count);
        sc.close();
    }
}
