package vetor_matriz;

public class OnlyEvenOutput {
    public static void main(String[] args) {
        int[] array = new int[6];
        array[0]=1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[5]=6;
        for (int num:array){
            if (num%2==0){
                System.out.println(num);
            }
        }


    }
}
