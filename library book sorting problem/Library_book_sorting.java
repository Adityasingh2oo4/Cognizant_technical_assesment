import java.util.Arrays;
public class Library_book_sorting {
    public static int minMoves(int N, String s){
        char[] original = s.toCharArray();
        char[] sorted = s.toCharArray();
        Arrays.sort(sorted);

        int count = 0;
        for(int i=0; i<N; i++){
            if(original[i] != sorted[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(minMoves(5, "helco"));
        System.out.println(minMoves(4, "asdf"));
    }
    
}
