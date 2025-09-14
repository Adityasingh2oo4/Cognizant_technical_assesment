public class library_book_collection_problem {
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;
        for(int i=3; i*i <= num; i += 2){
            if(num % i == 0) return false;
        }
        return true;
    }

    public static int maxBooks(int N, int K, int[] arr){
        int total = 0;
        for(int i=1; i<=N; i++){
            if(isPrime(i)){
                total += Math.min(K, arr[i-1]);
            }
        }
        return total;
    }
    public static void main(String[] args){
        int[] arr1 = {10, 2};
        System.out.println(maxBooks(2, 4, arr1));
    }
    
}
