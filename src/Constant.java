import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String t=in.nextLine();
        int c=0;

        for (int i=0; i<t.length(); i++) {
            char ch=t.charAt(i);

            if (ch=='B' || ch=='C' || ch=='D' ||
                    ch=='F' || ch=='G' || ch=='H' ||
                    ch=='J' || ch=='K' || ch=='L' ||
                    ch=='M' || ch=='N' || ch=='P' ||
                    ch=='Q' || ch=='R' || ch=='S' ||
                    ch=='T' || ch=='V' || ch=='W' ||
                    ch=='X' || ch=='Y' || ch=='Z' ||
                    ch=='b' || ch=='c' || ch=='d' ||
                    ch=='f' || ch=='g' || ch=='h' ||
                    ch=='j' || ch=='k' || ch=='l' ||
                    ch=='m' || ch=='n' || ch=='p' ||
                    ch=='q' || ch=='r' || ch=='s' ||
                    ch=='t' || ch=='v' || ch=='w' ||
                    ch=='x' || ch=='y' || ch=='z') {

                c++;
            }
        }

        System.out.print("Consonants = " + c);
    }
}
