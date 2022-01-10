import java.util.*;
class Symmetrix_Skew
{
    
    public void cal()
    {   
        int s=0;
        int z=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        System.out.println("Enter the elements of matrix");
        int a[][]=new int[r][c];
        int a1[][]=new int[r][c];
        for(int i=0;i<r;i++)     //getting the element of matrix
        { 
            for(int j=0;j<r;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                a1[i][j]=a[j][i];
            }
        }
        System.out.println("The orginal matrix is:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The transpose matrix is:");
        for(int i=0;i<r;i++)     //tranpose matrix checking
        {
            for(int j=0;j<r;j++)
            {
                System.out.print(a1[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<r;j++)
            {
               if(a[i][j]==a1[i][j])
               ++s;
            }
        }
        if(s==(r*r))
        z=1;
        s=0;
        for(int i=0;i<r;i++)     //skew Symmetrix checking
        {
            for(int j=0;j<r;j++)
            {
               if(a[i][j]==(-a1[i][j]))
               ++s;
            }
        }
        if(s==(r*r))
        z=2;
        if(z==1)
        System.out.println("It is an symmetrix matrix");
        else if(z==2)
        System.out.println("It is an skew matrix");
        else
        System.out.println("It is neither skew nor symmetrix matrix");
    }
}
        
        
    

        