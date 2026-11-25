import java.util.Scanner;

public class removedigits {
    public static void main() {
        Scanner t = new Scanner(System.in);
        String a = t.nextLine();
        String result = "";
        for ( char c : a.toCharArray()){
            if (!Character.isDigit(c)){
                result += c;
            }
        }
        System.out.println(result);

    }
}
