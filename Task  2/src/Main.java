import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        long rabbits = 11;
        long wolves = 2;
        for (int i = 1; i <= a; ++i){
            if (i % 2 != 0) rabbits *= 3;
            else {
                rabbits -= wolves * 10;
                sum += wolves;
            }
            if (rabbits < 0){
                int sum2 = 0;
                rabbits *= 1;
                while (rabbits > 0){
                    rabbits /= 10;
                    ++sum2;
                }
                wolves -= sum2;
            }
            if (sum == 7){
                ++wolves;
                sum = 0;
            }
        }
        System.out.println(rabbits + " " + wolves);
    }
}