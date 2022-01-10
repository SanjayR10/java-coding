import java.util.Scanner;

class secondFreChar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int first=-1,second=-1,c;
        String s=sc.nextLine();
        String h="",hh="";
        int g=0;
        for(int i=0;i<s.length();i++){
            c=1;
            for(int j=0;j<s.length();j++){
                if(!(i==j)){
                    if(s.charAt(i)==s.charAt(j)){
                    ++c;
                    g=j;
                    }
                }
            }
        
            int jj=0;
            // System.out.println(c);
            if(c>first){
                second=first;
                h=hh;
                hh=s.charAt(i)+"";
                first=c;
            }
            else if(c>second&&c!=first){
            second=c;
            h=s.charAt(i)+"";
        }
    }
        if(second==-1)
        System.out.println("No repeating element");
        else
        {
            System.out.println(second+" "+h);
        }
    }
}

