import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String[] words = a.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = 0; j < word.length(); j++) {
                char k = word.charAt(j);

                if (j == 0) {
                    k = Character.toUpperCase(k);
                } else {
                    k = Character.toLowerCase(k);
                }

                result += k;
            }

            result += " ";
        }

        System.out.println(result.trim());
    }
}