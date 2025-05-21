package dowlath.io.dsa.string;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String s = "aaabbbbccdde";
        String encoded = encodedString(s);
        System.out.println("Original String ... : "+s);
        System.out.println("Encoded String ... : "+encoded);
    }

   private static String encodedString(String s){
        if(s == null || s.isEmpty()) return "";
        StringBuilder encoded = new StringBuilder();
        int count = 1;
        char current = s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == current){
                count++;
            } else {
                encoded.append(current).append(count);
                current = s.charAt(i);
                count = 1;
            }
        }
        encoded.append(current).append(count);
        return encoded.toString();
   }
}
