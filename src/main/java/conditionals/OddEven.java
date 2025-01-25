package conditionals;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input a number Interger");
        int number = scan.nextInt();
        if (number%2==0){
            System.out.println("the number is even");
        }else{
            System.out.println("the number is odd");
        }
    }
}
