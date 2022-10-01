import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long min = 999999999;
        while(a > 0){
            if (a % 10 < min && a % 10 != 0) min = a % 10;
            a /= 10;
        }
        System.out.println(min);
    }
}