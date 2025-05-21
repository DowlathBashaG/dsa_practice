package dowlath.io.example.custom_functional_interface;

public class AddThreeNumbersExample {
        public static void main(String[] args) throws Exception {
            TryTriFunction<Integer, Integer, Integer, Integer> addThree = (a, b, c) -> a + b + c;

            int result = addThree.apply(5, 7, 8);
            System.out.println("Sum = " + result); // Output: Sum = 20
        }
}
