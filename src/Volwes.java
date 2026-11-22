import java.util.Scanner;

public class Volwes {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String t=in.nextLine();
        int c=0;

        for (int i=0; i<t.length(); i++) {
            char ch=t.charAt(i);

            if (ch=='A' || ch=='E' || ch=='I' ||
                    ch=='O' || ch=='U' || ch=='a' ||
                    ch=='e' || ch=='i' || ch=='o' ||
                    ch=='u') {
                c++;
            }
        }

        System.out.print("Vowels = " + c);
    }
}