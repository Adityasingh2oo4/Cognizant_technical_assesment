public class cryptographer {
    public static String decrypt(String s){
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == 'a'){
                result.append('z');
            } else {
                result.append((char)(c - 1));
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        System.out.println(decrypt("bcd"));
        System.out.println(decrypt("bcdaaacdza"));
        System.out.println(decrypt("aa"));
        System.out.println(decrypt("uvwxyza"));
    }
    
}
