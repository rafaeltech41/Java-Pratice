package vetor_matriz;

public class CountWords {
    public static void main(String[] args) {
        String[] words = {"houme", "programmer", "java", "curse", "book","pig"};
        int count=0;
        for (String word:words){
            if (word.length()>=4){count++;}
        }
        System.out.println(count);
    }
}
