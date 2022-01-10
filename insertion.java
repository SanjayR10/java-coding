import java.util.*;
class insertion
{
    public void insert()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of element");
    int n=sc.nextInt();
    int A[]=new int[n];
    int k;
    for(int i=0;i<n;i++)    //geting the element of array
    {
        System.out.println("Enter the element"+(i+1));
        A[i]=sc.nextInt();
    }
    System.out.println("Unsorted array:");
    for(int i=0;i<n;i++)
    {
        System.out.print(A[i]+",");
    }
    int i;
    for(int j=1;j<n;j++)    //sorting the array
    {
        k=A[j];
        i=j+1;
        while((i>=1)&&(A[i]>k))
        {
            A[i+1]=A[i];
            i--;
        }
        A[i+1]=k;
    }
    System.out.println("");
    System.out.println("Sorted array:");   //printing the sorted array
    for(int x=0;x<n;x++)
    System.out.print(A[x]+",");
    }
}
            