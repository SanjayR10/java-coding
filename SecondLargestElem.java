import java.util.*;

public class SecondLargestElem {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size");
    int n=sc.nextInt();
    System.out.println("Enter the elements");
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    } 
    int lar=0;
    for(int i=0;i<n;i++){
        if(lar>a[i])
        lar=a[i];
    } 
   int  large=0;
    for(int i=0;i<n;i++){
        if(a[i]!=lar&&large<a[i])
        large=a[i];
    } 
    System.out.println(large);
   } 
}
