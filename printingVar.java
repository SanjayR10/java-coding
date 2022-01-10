import java.util.*;

public class printingVar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int inte=0;int charr=0;
        String intee="",charrr="";
        String s1[]=s.split(";");
        for(String p:s1){
        String in[]=p.split(",");
       
        if(p.contains("int")){
            inte=inte+in.length;
            for(String te:in){
                te=" "+te;
                if(te.contains("=")){
                    intee=intee+te.substring(te.lastIndexOf(" "),te.length())+",";
                }
                else{
                
                intee=intee+te.substring(te.indexOf(" "),te.length())+"=chunk,";
                }
            }
        }
        else
        {
            charr=charr+in.length;
            for(String te:in){
                te=" "+te;
                if(te.contains("=")){
                    charrr=charrr+te.substring(te.lastIndexOf(" "),te.length())+",";
                }
                else{
               
                charrr=charrr+te.substring(te.lastIndexOf(" "),te.length())+"=chunk,";
                }
            }
        }
        }
        if(inte>0){
            System.out.println("Integer"); 
            for(String i:intee.split(",")){
            if(i.contains("int"))
            System.out.println(i.substring(i.lastIndexOf(" ")).trim());
            else
            System.out.println(i.trim());
            }
        }
        if(charr>0){
            System.out.println("Character"); 
            for(String i:charrr.split(","))
            System.out.println(i.trim());
            
        }
    }
}
