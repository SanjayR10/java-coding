package recursion_problems;
import java.util.Scanner;

public class UpperTriangleMatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("Enter the dimension");
        r=sc.nextInt();
        c=sc.nextInt();
        int a[][]=new int[r][c];
        if(r!=c)
        {
            System.out.println("Invalid Dimension");
            System.exit(0);
        }
        else
        {
            System.out.println("Enter the elements of the matrix");
            for (int i=0;i<r;i++)
            {
                for (int j=0;j<c;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            printUpperTriange(a,r,c);
        }
    }
    public static void printUpperTriange(int a[][],int r,int c)
    {
        System.out.println("Upper Triangle Matrix is:");
        for (int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                if(i>j)
                    System.out.print(0+" ");
                else
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
