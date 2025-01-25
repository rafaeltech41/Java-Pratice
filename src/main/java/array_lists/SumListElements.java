package main.java.array_lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SumListElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> intergerSum = new ArrayList<>();
        int sum = 0;
        System.out.println("how much numbers do you want sum?");
       int choice = scan.nextInt();
        for (int i = 0; i < choice; i++) {
            System.out.println("number "+(i+1));
            sum= scan.nextInt();
            intergerSum.add(sum);
        }
        for(Integer number:intergerSum){
            System.out.printf(String.format(number.toString())+"\t");
        }
        for (int i = 1; i < intergerSum.size(); i++) {
            sum+=intergerSum.get(i);

        }
        System.out.println(sum);
    }
}
