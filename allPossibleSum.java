
import java.util.*;

class allPossibleSum{
 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={10,1,2,7,6,1,5};
        int sum=8;
        ArrayList<Integer>s=new ArrayList<Integer>();
        for(int i:a)
        s.add(i);
        int j=0;
        findUnique(s,sum,new ArrayList<Integer>());
    }
    public static void findUnique(ArrayList<Integer> s, int sum,ArrayList<Integer> rem){
       
        int ss=0;
        for(int x:rem)
        ss=ss+x;
        if(ss==sum)
        System.out.println(rem);
        if(ss>=sum)
        return;

        for(int i=0;i<s.size();i++)
        {
             int n = s.get(i);
            ArrayList<Integer> sss = new ArrayList<Integer>();
            for(int j=i+1;j<s.size();j++){
                sss.add(s.get(j)); 
            }
            ArrayList<Integer> numberrr = new ArrayList<>(rem);
            numberrr.add(n);
            findUnique(sss, sum, numberrr);
        }

    }
}