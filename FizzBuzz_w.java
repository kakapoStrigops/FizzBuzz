public class FizzBuzz_w {
    public static void main(String[] args) {
        int num = 1;
        while (num < 31) {
            if (num % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(num);
            }
            num++;
        }
    }
}