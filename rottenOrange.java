import java.util.*;

public class rottenOrange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        sc.nextLine();
        int a[][]=new int[r][c];
        boolean rot=false;
        int zeroCount=0;
        for(int i=0;i<r;i++){
            String s=sc.nextLine();
            String te[]=s.split(" ");
            int j=0;
            for(int ii=0;ii<te.length;ii++){
                a[i][j++]=Integer.parseInt(te[ii]);
                if(Integer.parseInt(te[ii])==2)
                rot=true;
                if(Integer.parseInt(te[ii])==0)
                ++zeroCount;
            }
        }
        if(rot&&zeroCount<=4){
            boolean still_rot=true;
            boolean can_rot=true;
            ArrayList<String> l=new ArrayList<>();
            while(still_rot&&can_rot)
            {
                    for(int i=0;i<r;i++){
                        for(int j=0;j<c;j++){
                            if(i==0&&j==0){
                              if(!l.contains(Integer.toString(i)+Integer.toString(j))){
                              l.add(Integer.toString(i)+Integer.toString(j));
                            if(a[i][j+1]==1){
                                a[i][j]=2;
                            }
                        }
                          }  
                          else if(i==0){

                          }
                        }
                    }
            }
        }
        else{
            System.out.println("All oranges cannot be rot");
        }
    }
}
