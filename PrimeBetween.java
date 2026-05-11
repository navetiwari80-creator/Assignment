public class PrimeBetween {
    public static void main(String args[]) {
        int n = 10, k = 50;

        for(int i=n; i<=k; i++) {
            boolean flag = true;

            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag && i != 1)
                System.out.print(i + " ");
        }
    }
}
