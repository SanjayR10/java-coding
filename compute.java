//Subclass to find Fine
import java.util.*;
class compute extends Library      //Subclass
{
    Double f;
    int c=0,e,d;
    compute(String n,String au,double pe,int days)
    {
        super(n,au,pe);
        d=days;
    }
    public void fine()      //to calculate fine
    {
        int at=d-7;
        if(at<0)
        f=0.0;
        else if(at>=1&&at<=5)
        f=at*2.0;
        else if(at>=6&&at<=10)
        f=at*3.0;
        else
        f=at*5.0;
    }
    public void display()
    {
        super.show();
        System.out.println("Fine amount is Rs="+f);
        System.out.println("Total amount="+Math.ceil((((p*2.0)*d)+f)));
    }
    public void main()
    {
        Scanner sc=new Scanner(System.in);    //to get all details
        System.out.println("Enter the book name:");
        String a=sc.nextLine();
        System.out.println("Enter the author's name:");
        String b=sc.nextLine();
        System.out.println("Enter the price:");
        c=sc.nextInt();
        System.out.println("Enter the days:");
        d=sc.nextInt();
        compute ob=new compute(a,b,c,d);
        ob.fine();
        ob.display();
        }
    }
        
    