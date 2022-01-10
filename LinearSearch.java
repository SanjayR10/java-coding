package recursion_problems;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the search element");
        int se=sc.nextInt();
        int res=linearSearch(a,0,a.length-1,se);
        if(res!=-1)
            System.out.println("Element found at index "+res);
        else
            System.out.println("Element not found");
    }
    public static int linearSearch(int ar[],int start,int end,int search)
    {
        if(start>end)
            return -1;
        if(ar[start]==search)
            return start;
        if(ar[end]==search)
            return end;
        else
            return linearSearch(ar,start+1,end-1,search);
    }
}
