package dowlath.io.example.custom.custom_functional_interface;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomTryTriFunction<Integer,Integer,Integer,Integer> addThree = (a, b, c ) -> a+b+c;
        int result = addThree.apply(2,2,2);
        System.out.println("The Result ... : "+ result);
    }
}
