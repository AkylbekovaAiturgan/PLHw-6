import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int c = 0;

        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);


            if ( Character.isLetter(b) && (i==0 || a.charAt(i - 1) == ' ')){
                c++;
            }
        }
        System.out.println("Word = " +c);
    }
}