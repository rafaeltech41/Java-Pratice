package main.java.array_lists.delete_element_list;

import java.util.Scanner;

public class Menu {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


    }
    public static int menu(){
        int option = 0;
        do {
            String menu = String.format("""
                    \n
                    --- List Menu ---
                    choice a option
                    1.add names in the list
                    2.delete names from the list
                    3.show list
                    """);
            System.out.println(menu);
            option = scan.nextInt();
            switch (option){
                case 1-> AddNames.addNames();
                case 2-> RemoveNames.removeNames();
                case 3-> ShowNamesList.showNamesList();
            }
        }while (option!=4);
        return option;
    }
}
