public class Password_Distance_Problem {
    public static int distance(String s){
        int n = s.length();

        // allsame
        boolean allsame = true;
        for(int i=1; i<n; i++){
            if(s.charAt(i) != s.charAt(0)){
                allsame = false;
                break;
            }
        }
        if(allsame) return 0;

        // first char to last diff char
        int i = n-1;
        while(i >= 0 && s.charAt(i) == s.charAt(0)){
            i--;
        }
        int dist1 = i - 0;

        // last char to first diff char
        int j = 0;
        while(j < n && s.charAt(j) == s.charAt(n - 1)){
            j++;
        }
        int dist2 = (n-1) - j;

        return Math.max(dist1, dist2);
         
    }
    public static void main(String[] args){
        
        System.out.println(distance("abbdfggrtt"));
        System.out.println(distance("abc10"));
        System.out.println(distance("bbbbbbbbb"));
    }
    
}
