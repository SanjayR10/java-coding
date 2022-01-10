import java.util.HashSet;
import java.util.*;

public class dicTrans {
    public static void main(String args[]){
        String startWord="dog";
        String endWord="cat";
        HashSet<String> set=new HashSet<>();
        set.add("dot");
        set.add("dop");
        set.add("dat");
        set.add("cat");
        boolean fi=true;
        // int ret=0;
        ArrayList <String> anss=new ArrayList<>();
        if(!set.contains(endWord)){
        fi=false;
        System.out.println("null");
        }
        else{
            Queue<String> q=new LinkedList<>();
            q.offer(startWord);
            while(!q.isEmpty()){
                int size=q.size();
                for(int i=0;i<size;i++){
                    String curWord=q.poll();
                    char [] letWor=curWord.toCharArray();
                    for(int j=0;j<letWor.length;j++){
                        char orgChar=letWor[j];
                        for(char c='a';c<='z';c++){
                            if(letWor[j]==c)
                            continue;
                                letWor[j]=c;
                                String neww=String.valueOf(letWor);
                                // if(neww.equals(endWord)){
                                // // anss.add(neww);
                                // }
                                if(set.contains(neww))
                                {   
                                    if(neww.equals("dop"))
                                    anss.add("dog");
                                    else
                                    anss.add(neww);
                                    q.offer(neww);
                                    set.remove(neww);
                                }
                        }
                        letWor[j]=orgChar;
                    }
                }

               
            }


        }
        if(fi)
        System.out.println(anss);
    }
}
