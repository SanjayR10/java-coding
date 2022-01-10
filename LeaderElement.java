import java.util.Scanner;

public class LeaderElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
        }
        int lar=0;
        for(int i=n-1;i>=0;i--){
            if(lar<a[i]){
                lar=a[i];
            System.out.println(a[i]);
            }
        }
    }
}
