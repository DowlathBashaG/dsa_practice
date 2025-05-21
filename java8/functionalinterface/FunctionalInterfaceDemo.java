package dowlath.io.dsa.java8.functionalinterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        FuncInter total =   ((a, b) -> a * b);
        System.out.println(total.multiply(2,2));
    }
}
