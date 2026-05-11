public class Palindrome {
     public static void main(String args[]) {
        int n = 121, temp, rev = 0, rem;

        temp = n;

        while(n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        if(temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
