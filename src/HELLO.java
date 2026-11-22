import java.util.Scanner;
public class HELLO{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine(); // String is immutable
        String newtext = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            c = Character.toUpperCase(c);
            newtext = newtext + c;
        }
        System.out.println(newtext);
    }
}