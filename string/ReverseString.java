package dowlath.io.dsa.string;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Dowlath Basha G";
        String reverseString = "";

        for(int i= originalString.length()-1;i>=0;i--){
            reverseString+=originalString.charAt(i);
        }
        System.out.println("Original .... : " + originalString);
        System.out.println("ReverseString .... : " + reverseString);
    }
}
