import java.util.*;
class ArraySwiftOddEven{
    public static void main(String args[]){
       Scanner sc=new Scanner (System.in);
       System.out.println("Enter size");
       int n=sc.nextInt();
       System.out.println("Enter the elements");
       int a[]=new int[n];
       int aa[]=new int[n];
       int c=0;
       for(int i=0;i<n;i++){
           a[i]=sc.nextInt();
       } 
       for(int i=0;i<n;i++){
           if(a[i]%2==0)
           aa[c++]=a[i];
       }
       for(int i=0;i<n;i++){
        if(a[i]%2!=0)
        aa[c++]=a[i];
    }
    for(int i=0;i<n;i++){
        System.out.print(aa[i]+" ");
    }
    }
}