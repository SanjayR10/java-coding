package Programs;

public class ArrayRotate1 {

    public static int[] rotateArray(int a[],int n,int d){
        int tem[]=new int [d];
        for(int i=0;i<d;i++)
            tem[i]=a[i];

        for(int i=0;i<n-d;i++)
            a[i]=a[i+d];

        for(int i=n-d,j=0;i<n;i++)
            a[i]=tem[j++];

        return a;
    }

    public  static  void main(String args[]){
        int arr[]= {3,4,5,6,7,8};
        int d=4;
        int rotated[] = rotateArray(arr, arr.length,d);
        for(int i=0;i<rotated.length;i++)
            System.out.print(rotated[i]+" ");
    }
}
