import java.util.*;
class MissingNumArray{
    public static void findMissingNum(int arr[],int size){
        int sum=0;int sum1=0;
        for(int i=0;i<size-1;i++){
            sum=sum+arr[i];
            if(i!=0)
            sum1=sum1+i;
        }
        sum1=sum1+size+(size-1);
        System.out.println("Ans: "+(sum1-sum));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n-1];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n-1;i++)
        a[i]=sc.nextInt();
        findMissingNum(a,n);
     }
}