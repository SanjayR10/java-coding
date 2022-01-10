import java.util.*;

public class rainWater {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);   //(min(leftmax,rightmax)-a[i]);
       System.out.println("Enter the sizze");
       int n=sc.nextInt();
       System.out.println("Enter the elements");
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       a[i]=sc.nextInt();

       int l=0,r=n-1,rightmax=0,leftmax=0,res=0;

       while(l<=r){
           if(a[l]<=a[r]){    //making sure left max is les than right max
            if(a[l]>=leftmax) leftmax=a[l];        
            else
            res+=leftmax-a[l];
            ++l;
        }
        else{               
            if(a[r]>=rightmax) rightmax=a[r];
            else
            res+=leftmax-a[l];
            ++r;
           }
       }
       System.out.print(res);
   } 
}
