package ds;

import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int start = 0;
        int end = n - 1;
        while (end > start)
        {
            int temp=ar[end];
            ar[end]=ar[start];
            ar[start]=temp;
            ++start;
            --end;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
