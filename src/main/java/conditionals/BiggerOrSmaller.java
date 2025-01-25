package conditionals;

import java.util.Scanner;

public class BiggerOrSmaller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("insert two numbers: ");
        System.out.printf("number one: ");
        int a = scan.nextInt();
        System.out.printf("number two: ");
        int b = scan.nextInt();
        if (a > b)
            System.out.println(String.format(a + ">" + b));
        else  {
            System.out.printf(String.format(b + ">" + a));
        }
    }
}
