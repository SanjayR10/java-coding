import java.util.*;
public class insertionSort {
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
        for(int i=1;i<n;i++){
            int key=a[i];
            int tem=i-1;
            while(tem>=0&&key<a[tem]){
                a[tem+1]=a[tem];
                tem--;
            }
            a[tem+1]=key;
        }

        System.out.println(Arrays.toString(a));   
}
}
