import java.util.*;
public class CyclicalyRotateRev {
    public static void rotateByOne (int arr[],int rot,int n){
      for(int i=0;i<rot;i++)
      rotate(arr,n);
    }
    public static void rotate (int arr[],int n)
    {
        int temp=arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();

        System.out.println("Enter how much time to rotate element of array");
        int rot=sc.nextInt();

        
        System.out.println("Orginal array");
        printArray(a);
        
        rotateByOne(a,rot,n);
        
        System.out.println("After rotated array");
        printArray(a);
    }
}
