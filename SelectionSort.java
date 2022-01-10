import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int a []=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("After sorted:");
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            if(min!=i){
                int tem=a[i];
                a[i]=a[min];
                a[min]=tem;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
