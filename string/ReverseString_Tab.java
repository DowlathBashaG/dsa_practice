package dowlath.io.dsa.string;

public class ReverseString_Tab {
    public static void main(String[] args) {
        String s ="Dowlath Basha G";
        System.out.println(reverseString(s,"",s.length()-1));
    }
    static String reverseString(String s, String r, int i){
        if(i < 0){
            return r;
        }
        return reverseString(s,r+s.charAt(i),i-1);
    }
}
