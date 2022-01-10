import java.util.*;
class Symmetric_$_skew_Symmetric
{
   public void cal()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter an Square matrix");
         System.out.println("Enter the number of rows");
         int r=sc.nextInt();
         System.out.println("Enter an number of colums");
         int c=sc.nextInt();
         int a[][]=new int[r][c];
         int a1[][]=new int[r][c];
         System.out.println("Enter the element of the array");
         for(int i=0;i<r;i++)
         {
             for(int j=0;j<c;j++)
             {
                 a[i][j]=sc.nextInt();
                }
            }
            System.out.println("The orginal matrix is:");
            for(int i=0;i<r;i++)
               {
             for(int j=0;j<c;j++)
             {
                 System.out.print(a[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("The transpose matrix is:");
             for(int i=0;i<r;i++)
                {
             for(int j=0;j<c;j++)
             {
                 a1[i][j]=a[j][i];
                }
            }
            for(int i=0;i<r;i++)
         {
             for(int j=0;j<c;j++)
             {
                System.out.print(a1[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
        
    