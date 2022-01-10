import java.util.*;
class linera
{
    public void cal()
    {
         int m=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++)
        a[i]=sc.nextLine();
        sc.next();
        System.out.println("Enter the Search element ");
        String nn=sc.nextLine();
        sc.next();
        for(int i=0;i<n;i++)
        {
            if(a[i].equals(nn))
            {System.out.println(i);
                ++m;
                break;
            }
            
        }
        
        if(m>0)
        System.out.println("the Element is found");
        else
        System.out.println("Element not found");
    }
}

        