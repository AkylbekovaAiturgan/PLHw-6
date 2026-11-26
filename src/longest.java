import java.util.Scanner;

public class longest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String t = s.nextLine();
        String[] w = t.split(" ");

        String l = "";

        for (int i = 0; i < w.length; i++) {
            if (w[i].length() > l.length()) {
                l = w[i];
            }
        }

        System.out.println(l);
    }
}
