import java.util.*;
public class MaxSubArrayKidaneAlgo {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter Element of array");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int sum=0;
        int max=a[0];

        for(int i:a){
            sum=sum+i;
            max=Math.max(sum,max);
            sum=(sum<0)?0:sum;
        }
        System.out.println(sum);

    }
}