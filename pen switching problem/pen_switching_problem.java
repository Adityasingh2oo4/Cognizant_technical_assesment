public class pen_switching_problem {
    public static int switchPens(int[] arr, int N){
        int count = 0;
        for(int i=0; i<N; i++){
            if(arr[i] % 2 != 0 && arr[i+1] % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr1 = {70, 23, 13, 26, 72, 19};
        System.out.println(switchPens(arr1, 5));
    }
    
}
