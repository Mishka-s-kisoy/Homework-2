import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a % 10;
        if (a / 10 % 10 == 1) b = 0;
        String result = " TORT";
        switch(b) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 0:
                result += "OV";
                break;
            case 2:
            case 3:
            case 4:
                result += "A";
                break;
        }
        System.out.println(a + result);
    }
}