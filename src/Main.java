import java.util. Arrays;

public class Main {
    public static void main (String[]args) {
        int[] num = new int[6];
        int n = 5;

        num[0] = 18;
        num[1] = 20;
        num[2] = 24;
        num[3] = 70;
        num[4] = 40;
        System.out.println("Before insertion :" + Arrays.toString(num));

        int element = 709;
        int pos = 3;

        for (int i = n - 1; i >= pos - 1; i--) {
            num [i + 1] = num[1];
        }
     num[pos -1 ]= element;
        n++;
     System.out.println("After insertion ;" + Arrays.toString(num));
        }

    }