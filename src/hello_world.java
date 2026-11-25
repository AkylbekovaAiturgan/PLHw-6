import java.util.Scanner;

public class hello_world {
    public static void main() {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();

        String result = "";

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);

            if (b == ' ') {
                result += '_';
            } else {
                result += b;
            }
        }

        System.out.println(result);

    }
}
