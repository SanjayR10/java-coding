import java.util.Scanner;

public class DistinctElementInArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        System.out.println("Enter the element ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int j;
            for(j=0;j<i;j++)
                if(a[i]==a[j])
                    break;

             if(i==j)
                 System.out.println(a[i]+" ");
        }
    }
}
