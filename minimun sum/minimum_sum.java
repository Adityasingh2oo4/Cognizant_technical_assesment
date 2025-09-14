import java.util.Arrays;
public class minimum_sum {
    static int minSum(int n, int[] A, int[] B){

        Arrays.sort(A); //ascending order
        Arrays.sort(B); //ascending order

        //reverse B for descending order
        for(int i=0; i<n/2; i++){
            int temp = B[i];
            B[i] = B[n-1-i];
            B[n-1-i] = temp;
        }
        
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += A[i] * B[i];
        }
        
        return sum;
    }

    public static void main(String[] args){
        int[] A = {1, 4, 3, 2};
        int[] B = {1, 4, 3, 4};
        System.out.println(minSum(4, A, B));
    }
    
}
