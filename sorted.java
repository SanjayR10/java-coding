import java.util.*;

public class sorted {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter Element of array");
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int t=-1;
        int i=0;
        int j=a.length-1;

        while(i<j){
            b[++t]=a[i];
            b[++t]=a[j];
            ++i;
            --j;
        }
        System.out.println(Arrays.toString(b));
    }
}
