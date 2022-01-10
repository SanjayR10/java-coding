import java.util.*;
public class stu {
    int roll,age;String name;
    stu(int roll,int age,String name)
    {
        this.roll=roll;
        this.age=age;
        this.name=name;
    }
    class SortRoll implements Comparable<stu>
    {
        int compareTo(stu a,stu b)
        {
            return a.roll-b.roll;
        }
    }
    class Main
    {
        public static void main(String args[])
        {
            ArrayList<stu> al=new ArrayList<stu>();
            al.add(new stu(91,19,"Sanjay"));
            al.add(new stu(65,19,"naveen"));
            al.add(new stu(84,19,"rohit"));
            al.add(new stu(93,19,"Sanjeev"));
            SortRoll obj=new SortRoll();
            Collections.sort(al,obj);
            System.out.println(al);
        }
    }
}
