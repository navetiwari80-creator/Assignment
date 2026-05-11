public class CountPrime {
    public static void main(String args[]) {
        int a[] = {2,3,4,5,6,7};
        int count = 0;

        for(int i=0; i<a.length; i++) {
            boolean flag = true;

            for(int j=2; j<a[i]; j++) {
                if(a[i] % j == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag && a[i] != 1)
                count++;
        }

        System.out.println("Prime Count = " + count);
    }
}
