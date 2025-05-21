package dowlath.io.dsa.string;

public class StringPermutationsExample {
    public static void main(String[] args) {
        String input = "abc";
        generationPermutations(" ",input);
    }
    private static void generationPermutations(String prefix, String remaining){

        if(remaining.isEmpty()){
            System.out.println(prefix);
            return;
        }

        for(int i=0;i<remaining.length();i++){
            char current = remaining.charAt(i);
            String before = remaining.substring(0,i);
            String after = remaining.substring(i+1);
            generationPermutations(prefix+current,before+after);
        }

    }
}
