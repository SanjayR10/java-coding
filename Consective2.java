import java.util.*;
class Consective2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dcount=1,icount=1,pre=n%10,fl=-1,f11=-1;

        n=n/10;
        while(n>0){
            
            int last=n%10;
                if(last==(pre-1))
                {
                    ++dcount;
                }
               else if(last==(pre+1)){
                    ++icount;
                }
                else{
                    icount=0;
                    dcount=0;
                }
                
            
            pre=last;
            n/=10;

        }
        System.out.println(dcount);
        System.out.println(icount);
    }
}