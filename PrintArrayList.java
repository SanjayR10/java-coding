package recursion_problems;
import java.util.*;

public class PrintArrayList {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> a=new ArrayList<>();
        System.out.println("Enter the element of arraylist");
        for(int i=0;i<6;i++)
            a.add(sc.next());
        printAll(a);
    }
    public static void printAll(ArrayList<String> a)
    {
        Iterator it= a.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
    }
}
