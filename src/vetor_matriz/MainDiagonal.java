import java.util.Scanner;

public class MainDiagonal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][]matrix = new int[4][4];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("set numbers in the array"+"["+i+"]"+"["+j+"]");

                matrix[i][j]=scan.nextInt();
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf(matrix[i][j]+"\t");

            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("--------");
            System.out.println(matrix[i][i]);
        }

    }
}
