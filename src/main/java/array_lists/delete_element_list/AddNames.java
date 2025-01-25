package main.java.array_lists.delete_element_list;

import java.util.Scanner;

public class AddNames {
    protected static void addNames(){
        Scanner scan = new Scanner(System.in);
        System.out.println("how much names do you want sum in the list?");
        int choice = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < choice; i++) {
            System.out.println("name: "+(i+1));
            Main.listNames.add(scan.nextLine());
        }
        ShowNamesList.showNamesList();
    }
}
