import java.util.*;
public class ISC2018Q3
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String ar[];
        int n, i, j;
        System.out.println("Enter the number of names: ");
        n = sc.nextInt();
        ar = new String[n];
        System.out.println("Enter the names: ");
        for(i=0;i<n;i++)
        {
            ar[i] = sc.nextLine();
        }
        int max = 0;

        for(i=0;i<n;i++)
        {
            if(max<ar[i].length())
            max = ar[i].length();       //Finding the length of the longest string
        }
        System.out.println("OUTPUT:" );
        for(i=0;i<max;i++)
        {
            for(j=0;j<n;j++)
            {
                /*character will be extracted only when i has a value less
                 * than the length of the string else only tabular space will be printed
                 */ 
                if(i<ar[j].length())
                    System.out.print(ar[j].charAt(i)+"\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
import java.util.*;
class palindrome
{int d,r=0;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int f=sc.nextInt();
        if(method(f)==f)
        System.out.println("palindrome");
        else
        System.out.println("not palindrome");
    }
    int method(int j)
    {
        if(j>0)
        {
            d=j%10;
            r=r*10+d;
            return (method(j/10));
        }
        return r;
    }
    
}
            
            
        import java.util.*;
class keithno
{
    public void cal()
    {
        int n,nn,c=0,s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        n=sc.nextInt();          //To Get The Value
        nn=n;
        int arr[]=new int[n];
        while(nn>0)             //to count the no of digits
        {
            ++c;
            nn/=10;
        }
        nn=n;
        
        for(int j=c-1;j>=0;j--)   //to store the digits in array
        {
            arr[j]=nn%10;
            nn/=10;
        }
        for(int i=0;i<=n;i++)    
        {
            for(int f=i;f<c;f++)
            {
                s=s+arr[f];            //To Check for Keith Number
            }
            arr[c]=s;
            if(s>=n)
            break;
            s=0;
            ++c;
            
        }
        if(s==n)
        System.out.println(n+" is an Keith Number");
        else
        System.out.println(n+" is not an Keith Number");
    }
}

      
   