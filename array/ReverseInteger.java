package dowlath.io.dsa.array;

public class ReverseInteger {
    public static void main(String[] args) {
        int n = 123;
        System.out.println("Reverse Integer ... : "+ reverseNumber(n));
    }
    static int reverseNumber(int n){
        int result = 0;
        while( n != 0){
            int remainder = n % 10;
            int temp =  result * 10 + remainder;
            n = n / 10;
            result = temp;
        }
        return result;
    }
}
