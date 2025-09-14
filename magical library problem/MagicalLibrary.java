public class MagicalLibrary {
    public static int magicalsum(int R, int C, int[][] A){
        int count = 0;
        for(int i=0; i<R; i++){
            int oddSum = 0;
            for(int j=0; j<C; j++){
                if(A[i][j] % 2 == 1){
                    oddSum += A[i][j];
                }
            }
            if(oddSum % 2 == 0 && oddSum != 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[][] A = {
            {2, 4},
            {0, 0},
            {10, 11}
        };
        System.out.println(magicalsum(3, 2, A));
    }
    
}
