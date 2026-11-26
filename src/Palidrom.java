import java.util.Scanner;
public class Palidrom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String r = new StringBuilder(a).reverse().toString();
        if ( a.equalsIgnoreCase(r)){
            System.out.println("Palidrom");
        }else{
            System.out.println("Not Palidrom");
        }

    }
}
