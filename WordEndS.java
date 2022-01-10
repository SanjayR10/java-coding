
import java.util.*;
public class WordEndS {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String n=sc.nextLine();
        String strArray[] = n.split(" ");
        for(int i=0;i<strArray.length;i++)
        {
            if(strArray[i].charAt(strArray[i].length()-1)=='S'|| strArray[i].charAt(strArray[i].length()-1)=='s')
                System.out.print(strArray[i]+" ");
        }
    }
}
