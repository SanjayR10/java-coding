//Read a file
import java.util.*;   
import java.io.*;
class file
{
    String t;int i;
    public void cal()throws Exception
    {
        FileReader fr=new FileReader("Name.txt");    //to access the file
        BufferedReader br=new BufferedReader(fr);
        System.out.println("Name"+"\t"+"Basic Salary"+"\t"+"Allowance"+"\t"+"Deduction");
        while((t=br.readLine())!=null)              //to print the data from  file
        {
            System.out.print(t+"\t");
            System.out.println("");
        }
        br.close();
    }
}
   
    