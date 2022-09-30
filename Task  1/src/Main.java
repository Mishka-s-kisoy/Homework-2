import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int c = 0;
        if (a == 1 || a == 2) c = 1;
        else {
            int d = 1, b = 1;
            for (int i = 2; i < a; i++) {
                c = d + b;
                d = b;
                b = c;
            }
        }
        System.out.println(c);
    }
}