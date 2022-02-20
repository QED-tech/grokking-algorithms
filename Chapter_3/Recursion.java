package Chapter_3;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(15));
    }

    private static int factorial(int i) {
        if (i <= 1) {
            return i;
        }

        return i * factorial(i - 1);
    }

}
