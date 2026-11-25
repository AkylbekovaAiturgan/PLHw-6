import java.util.Scanner;

public class nothup {
    public static void main() {
        Scanner t = new Scanner(System.in);
        String a = t.nextLine();
        String result = "";
            for (int i = a.length() - 1; i >= 0; i--) {
                char b = a.charAt(i);
                result += b;
            }
        System.out.println(result);
        }

    }

