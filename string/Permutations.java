package dowlath.io.dsa.string;


public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
        generatePermutation(" ", s);
    }
    private static void generatePermutation(String prefix,String input){
        if(input == null || input.isEmpty()){
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<input.length();i++){
            char current = input.charAt(i);
            String before = input.substring(0,i);
            String after = input.substring(i+1);
            generatePermutation(prefix+current,before+after);
        }
    }
}
