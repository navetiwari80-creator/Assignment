public class Armstrong {
    public static void main(String args[]) {
        int n = 153, temp, rem, sum = 0;

        temp = n;

        while(n > 0) {
            rem = n % 10;
            sum += rem * rem * rem;
            n /= 10;
        }

        if(temp == sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
