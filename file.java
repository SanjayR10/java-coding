//write a file
import java.util.*;   
import java.io.*;
class file
{
    String s,l,q,r,t;
    public void cal()throws Exception
    {
       Scanner sc=new Scanner(System.in);
       FileWriter az=new FileWriter("Name.txt");
       BufferedWriter bz=new BufferedWriter(az);
       PrintWriter pz=new PrintWriter(bz);
       System.out.println("Enter the number of employees");
       int n=sc.nextInt();              //to get the number of employees
       for(int i=0;i<n;i++)
       {
           System.out.println("Enter the name of employee");
           s=sc.next();                //to enter the name of employee
           pz.print(s);
           pz.print("\t");
           System.out.println("Enter the basic pay");
           l=sc.next();                //to enter the basic pay
           pz.print(l);
           pz.print("\t");
           pz.print("\t");
           System.out.println("Enter the allowance");
           r=sc.next();                 //to enter the allownace
           pz.print(r);
           pz.print("\t");
           pz.print("\t");
           System.out.println("Enter the deduction");
           t=sc.next();                //to calculate the dedection amount
           pz.print(t);
           pz.print("\t");
           pz.print("\t");
        }
        System.out.println("Written to file");
        pz.close();
    }
}
 