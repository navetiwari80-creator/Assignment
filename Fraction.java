public class Fraction {
    public static void main(String args[]) {
        int n = 5;
        float sum = 0;

        for(int i=1; i<=n; i++) {
            sum += (float)i / (i+1);
        }

        System.out.println("Sum = " + sum);
    }
}
