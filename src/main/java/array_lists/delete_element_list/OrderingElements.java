package main.java.array_lists.delete_element_list;
import java.util.*;
public class OrderingElements {
    public static void main(String[] args) {
        ArrayList<Integer> listInterger = new ArrayList<>();
        listInterger.add(8);
        listInterger.add(5);
        listInterger.add(7);
        listInterger.add(6);
        listInterger.add(3);
        listInterger.add(2);
        listInterger.add(1);
        listInterger.add(4);

        System.out.println(listInterger);
        Collections.sort(listInterger);
        System.out.println(listInterger);
    }
}
