import java.util.*;
class piglatinString
{
    public void cal()
    {
        String n="",a;
        int l,c=0;
        char h;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the String");
        a=SC.nextLine();                    //inputting the string      
        l=a.length();
        a=a.toLowerCase();
        for(int i=0;i<l;i++)
        {
           h=a.charAt(i);
           if(h=='a'||h=='e'||h=='i'||h=='o'||h=='u')     //finding vowels in the string
           {
               n=a.substring(i)+a.substring(0,i)+"ay";    //to add "ay" to the string
               ++c;
               break;
               
            } 
            
             
            }
            if(c==1)                         //printing piglatin string
            System.out.println(n);
            else
            {
                n=a+"ay";
                System.out.println(n);
            }

        }
    }
               
            