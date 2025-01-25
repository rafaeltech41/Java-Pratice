package vetor_matriz;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AdditionMatrix {
    public static void main(String[] args) {
        int[][]matrix= new int[3][3];
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i< matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("input the number "+(i+1));
                int numberEntered =scan.nextInt();
                matrix[i][j]=numberEntered;
                sum+=matrix[i][j];

            }
        }
        System.out.println(sum);
    }
}