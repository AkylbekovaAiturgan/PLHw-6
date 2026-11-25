import java.util.Scanner;

public class aaabbbc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();

        for (int i=0; i<a.length(); i++) {
            char b=a.charAt(i);
            int count=0;

            for (int j=0; j<a.length(); j++) {
                if (b==a.charAt(j)) {
                    count++;
                }
            }

            if (count==1) {
                System.out.println(b);
                break;
            }
        }
    }
}
