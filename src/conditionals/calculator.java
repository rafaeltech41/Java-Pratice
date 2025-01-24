package conditionals;

import java.util.Scanner;

public class calculator {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;

        do {
            System.out.printf("""
                ----calculator-----
                choose which operation you want
                1 addition 
                2 subtraction 
                3 division 
                4 multiplication
                5 exit
                
                """);

            option = scan.nextInt();
            if (option==5){
                break;}else{
                int choice = option;
                menu();
                switch (choice){

                    case 1 -> addition(a,b);
                    case 2 -> subtraction(a,b);
                    case 3 -> division(a,b);
                    case 4 -> multiplication(a,b);
                    case 5 -> System.out.println("end");
                    default -> System.out.println("Opção inválida! Tente novamente.");
                }
                }
        }while (option!=5);

    }
    static int a = 0;
    static int b = 0;
    private static void menu(){
        System.out.println("input two interger number:");
        System.out.printf("number a: ");
        a = scan.nextInt();
        System.out.printf("number b: ");
         b = scan.nextInt();

    }
    protected static int addition(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
    protected static int subtraction(int a, int b){
        System.out.println(a-b);
        return a-b;
    }
    protected static double division (int a, int b){
        System.out.println(a/b);
        return a/b;
    }
    protected static double multiplication(int a , int b){
        System.out.println(a*b);
        return a*b;
    }
}
