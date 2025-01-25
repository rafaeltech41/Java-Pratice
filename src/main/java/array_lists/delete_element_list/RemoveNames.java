package main.java.array_lists.delete_element_list;

import java.util.Scanner;

public class RemoveNames {
    public static void removeNames(){
        Scanner scan = new Scanner(System.in);
        int choice=0 ;
        System.out.println("choose the name do you want delete from the list: ");
        for (int i=0; i<Main.listNames.size(); i++){
            System.out.println(i+"-"+Main.listNames.get(i));
        }
        choice = scan.nextInt();
        Main.listNames.remove(choice);
        ShowNamesList.showNamesList();
    }
}
