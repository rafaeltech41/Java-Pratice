package main.java.array_lists;

import java.util.ArrayList;

public class SearchElements {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Vampeta");
        nameList.add("Kamila");
        nameList.add("Nathan");
        nameList.add("Miague");

        System.out.println(nameList.contains("Vampeta"));
        System.out.println(nameList.contains("Kamila"));
        System.out.println(nameList.contains("Negueba zika"));
        System.out.println(nameList.contains("Nathan"));
        System.out.println(nameList.contains("Miague"));
    }
}
