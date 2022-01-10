import java.util.Arrays;
import java.util.Scanner;
public class bubbleSort {
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
        for(int j=0;j<n-1;j++){
            if(a[j]>a[j+1]){
                int tem=a[j];
                a[j]=a[j+1];
                a[j+1]=tem;
            }
        }
    }
    System.out.println(Arrays.toString(a));
    }
}
