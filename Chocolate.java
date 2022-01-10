import java.util.*;

public class Chocolate {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);   //(min(leftmax,rightmax)-a[i]);
    System.out.println("Enter the sizze");
    int n=sc.nextInt();
    System.out.println("Enter the elements");
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    System.out.println("Enter m ");
    int m=sc.nextInt();
    Arrays.sort(a);
    int small=a[a.length-1];
    for(int i=0;i<n-m;i++){
        int diff=a[i+m-1]-a[i];
        if(diff<small)
        small=diff;
    }
System.out.println(small);
    }
}
