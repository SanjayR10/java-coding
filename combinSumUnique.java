import java.util.*;

public class combinSumUnique {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        System.out.println("Enter the element");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the sum");
        int su=sc.nextInt();

        int sum=0;
        // for(int i=0;i<n;i++){
            // for(int j=i;j<n;j++){
        //         if(su>sum)
        //         sum=sum+a[i];
        //         else if(su==sum)
        //         System.out.println(su);
        //         else
                // sum=0;
        //     }
        // }
        int i=0,j;
        while(i<n){
            j=i;
            while(j<n){
                if(su>sum){
                sum=sum+a[i];
                ++j;}
                else if(su==sum){
                System.out.println(su);
                }
                else{
                sum=0;
                ++j;
                }
            }
        }
    }
}
