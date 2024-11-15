public class primenumber {
    public static void main(String[] args) {
        int number = 17;
        System.out.println(isitaPrime(number));
    }

    public static boolean isitaPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
