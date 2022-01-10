import java.util.Scanner;
public class pattern13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows= sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
        
        int alphabet = 65; // ASCII value of alphabet 'A'
        
        for (int i=0; i<rows ; i++)
        {
            for (int j=rows-1; j>=i; j--)
            {
                 System.out.print(" ");
            }
            for (int j=0; j<=i; j++)
            {
                 System.out.print((char) (alphabet+j) + " ");
            }
            for (int j=i-1; j>=0; j--)
            {
                 System.out.print((char) (alphabet+j) + " ");
            }
            System.out.println();
        }
        
        //Close the resources
         
        sc.close();
    }
}