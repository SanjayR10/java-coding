import java.util.*;
class Sqro
{
    public void cal()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int r=sc.nextInt();
        System.out.println("Enter the column");
        int c=sc.nextInt();
        System.out.println("Enter the elements of first matrix");
        int a[][]=new int[r][c];
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int a1[]=new int[r*r];
        int f=0;
    for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i!=0&&j!=0&&i!=r-1&&j!=c-1)   
                a1[f]=a[i][j];
    