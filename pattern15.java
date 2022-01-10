import java.util.Scanner;
public class pattern15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows= sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
        
        int alphabet = 65; // ASCII value of alphabet 'A'
        int alpha=65;
        for (int i=1; i<=rows ; i++)
        {
            for (int j=1; j<=rows-i; j++)
            {
                 System.out.print(" ");
            }
            for (int j=i; j>=1; j--)
            {
                 System.out.print((char) (alphabet++) );
            }
            for (int j=i; j>=1; j--)
            {
                 System.out.print((char) (alpha++));
            }
            System.out.println();
        }
        
        //Close the resources
         
        sc.close();
    }
}