public class chocolate_distribution_problem {
    static final long MOD = 10000000007L;

    public static long totalChocolates(int N){
        long total = 0;

        for(int i=1; i<=N; i++){
            long chocolate = i;

            int prev = (i == 1) ? N : i-1;
            int next = (i == N) ? 1 : i+1;

            if(prev % 5 == 0 || next % 5 == 0){
                chocolate += 2;
            }
            total = (total + chocolate) % MOD;
        }
        return total;

    }

    public static void main(String[] args){
        System.out.println(totalChocolates(5));
        System.out.println(totalChocolates(7));
        System.out.println(totalChocolates(10));
        System.out.println(totalChocolates(3));
        System.out.println(totalChocolates(23));
    }
    
}
