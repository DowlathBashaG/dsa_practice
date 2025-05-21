package dowlath.io.dsa.string;

// CSE MANAVAN
public class Permutations_BackTracking {
    public static void main(String[] args) {
        String s = "abc";
        generatePermutations(s," ");
    }

    private static void generatePermutations(String input,String output){
        if(input.length() == 0){
            System.out.println(output + " ");
        }
        for( int i = 0;i<input.length();i++){
            char c = input.charAt(i);
            String rem = input.substring(0,i) + input.substring(i+1);
            generatePermutations(rem,output+c);
        }
    }
}
