package recursion_problems;
import java.util.Scanner;

public class QuickSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the element");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        quickSort(a,0,a.length-1);
        System.out.println("Sorted array: ");
        for (int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void quickSort(int ar[],int low,int high)
    {
        if(low<high)
        {
           int loc=partition(ar,low,high);
            quickSort(ar,low,loc-1);
            quickSort(ar,loc+1,high);
        }
    }
    public static int partition(int arr[],int lb,int ub)
    {
        int pi=arr[0];
        int start=lb,end=ub;
        while(start<end)
        {
            while(arr[start]<=pi) {
                ++start;
            }
            while (arr[end]>pi){
                --end;
            }
            if(start<end)
            {
                swap(arr[start],arr[end]);
            }
        }
        swap(arr[lb],arr[end]);
        return end;
    }
    public static void swap(int first,int second)
    {
        int tem=first;
        first=second;
        second=tem;
    }
}
