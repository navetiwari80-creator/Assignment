import java.util.Arrays;

public class SortArray {
    public static void main(String args[]) {
        int a[] = {5,2,8,1,9};

        Arrays.sort(a);

        System.out.println("Sorted Array:");

        for(int i : a)
            System.out.print(i + " ");
    }
}
