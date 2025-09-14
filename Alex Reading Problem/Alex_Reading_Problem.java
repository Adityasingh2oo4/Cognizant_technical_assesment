import java.util.Arrays;
public class Alex_Reading_Problem {
    public static int canRead(int[] arr, int hrs, int n){
        Arrays.sort(arr);
        int sum = 0; 
        int count = 0;
        for(int i=0; i<n; i++){
            if(sum + arr[i] <= hrs){
                sum += arr[i];
                count++;
            }else{
                break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr = {4, 2, 3, 1};
        System.out.println(canRead(arr, 5, 4));
    }
    
}
