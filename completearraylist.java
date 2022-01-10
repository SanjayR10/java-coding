import java.util.ListIterator;
import java.util.*;

public class completearraylist {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arraylist");
        ArrayList <Integer> a1=new ArrayList<Integer>();
        int size=sc.nextInt();
        for(int i=0;i<size;i++)
            a1.add(sc.nextInt());

        ListIterator itr=a1.listIterator();
        System.out.println("Arraylist elements");
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

      System.out.println("Arraylist elements in reverse order");
        while(itr.hasPrevious())
        {
            System.out.print(itr.next()+" ");
        }

        System.out.println("Enter element to search");
        int search=sc.nextInt();
        if(a1.contains(search))
            System.out.println("found");
        else
            System.out.println("not found");

        System.out.println("Enter index");
        int index=sc.nextInt();
        a1.remove(index);

       System.out.println(a1.indexOf(10));
        System.out.println(a1.lastIndexOf(10));
        System.out.println("The size of a1" +a1.size());
        a1.add(40);
        a1.add(41);
     ArrayList<Integer> a2=new ArrayList<>();
     for(int i:a1)
     {
         if(i%3==0)
             a2.add(i);
     }
      a1.removeAll(a2);
     a2.clear();
     System.out.println(a2.size());
    }
}
