package vetor_matriz;

import java.lang.foreign.PaddingLayout;

public class VectorExercise {

    public static void main(String[] args) {
        int[]intergerVetor = new int[3];
          int adiction = 0;
intergerVetor[0] = 7;
intergerVetor[1] = 7;
intergerVetor[2] = 7;
for (int i=0; i<intergerVetor.length;i++){
    adiction+=intergerVetor[i];
}
        System.out.println(adiction);
    }
}
