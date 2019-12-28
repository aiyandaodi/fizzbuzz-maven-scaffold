import static java.lang.String.format;

public class FizzBuzz {
    //主函数
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(of(i));
        }
    }
    public static String of(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return format("%d", number);
    }
}
