package main.java.array_lists;

import java.util.ArrayList;

public class CreateAddElementList {
    public static void main(String[] args) {
        ArrayList<Integer> intergerList = new ArrayList<>();
        intergerList.add(10);
        intergerList.add(20);
        intergerList.add(30);
        intergerList.add(40);
        intergerList.add(50);
        for (Integer number : intergerList){
            System.out.print(number);
        }
    }
}
