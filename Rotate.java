import java.util.*;
class Rotate
{
    public void cal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for ClockWise rotation");
        System.out.println("Enter 2 for AntiClockWise rotation");
        int a=sc.nextInt();
        System.out.println("Enter the no of rows");
        int r=sc.nextInt();
        System.out.println("Enter the no of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)        //getting the element of matrix
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The orginal matrix:");
        for(int i=0;i<r;i++)
        {
            for(int  j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The rotated matrix is:");
        if(a==1)        //Rotating the matrix
        {
            for(int i=0;i<c;i++)
            {
                for(int j=r-1;j>=0;j--)
                {
                System.out.print(arr[j][i]+"\t");
            }
                System.out.println();
            }
        }
        else
        {
            for(int i=c-1;i>=0;i--)
            {
                for(int j=0;j<r;j++)
                {
                System.out.print(arr[j][i]+"\t");
            }
                System.out.println();
            }
        }
    }
}
        
                    