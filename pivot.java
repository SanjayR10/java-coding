import java.util.*;
public class pivot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print("Enter pivot element");
        int p=sc.nextInt();
        int j=0;
        for(int i=0;i<n;i++){
           if(a[i]<p){
                a[j]=a[i];
                ++;
           }
        }
        System.out.println(Arrays.toString(a));
    }
}
