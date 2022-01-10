package Programs;

public class ArrayRotate2 {

    public static void rotate(int a[],int n){
        int tem=a[0];
        for(int i=0;i<n-1;i++)
            a[i]=a[i+1];

        a[n-1]=tem;
    }

    public static int[] rotateArray(int a[],int n,int d){
       for(int i=0;i<d;i++)
       {
           rotate(a,n);
       }
       return a;
    }


    public static void main(String args[]){
        int arr[]= {3,2};
        int d=1;
        int rotated[] = rotateArray(arr, arr.length,d);
        for(int i=0;i<rotated.length;i++)
            System.out.print(rotated[i]+" ");
    }
}
