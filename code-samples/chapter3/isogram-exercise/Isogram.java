import java.util.Scanner;
import java.lang.String;

public class Isogram {
    public static boolean isIsogram(String s) {
        String c = s.toLowerCase();
        for (int i = 0; i < c.length(); i++) {
            for (int j = i + 1; j < c.length(); j++) {
                if (c.charAt(i) == c.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a single word: ");
        String s = input.next();
        if (isIsogram(s)) {
            System.out.println(s + " is an isogram");
        } else {
            System.out.println(s + " is not an isogram");
        }
    }
}
