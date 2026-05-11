public class Cubes {
      public static void main(String args[]) {
        int n = 123, rem, sum = 0;

        while(n > 0) {
            rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }

        System.out.println("Sum = " + sum);
    }
}
