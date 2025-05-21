package dowlath.io.example.custom.custom_generics;

public class Main {
    public static void main(String[] args) {
       // Printer<Integer> printer = new Printer<>(45);
        Printer<String> printer = new Printer<>("Hello");
        printer.print();
    }
}
