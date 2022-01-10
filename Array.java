package simple_dynamic_array_with_simple_functions;

public class Array {
    private int[] items;
    private int count;
    public Array(int length)
    {
        items=new int [length];
    }
    public void insert(int item)
    {
       if(count==items.length)
       {
           int[] newItems = new int[count * 2];
           for (int i = 0; i < items.length; i++)
               newItems[i] = items[i];
           items=newItems;
       }
        items[count++]=item;
    }
    public void removeAt(int index)
    {
        if (index<0 || index>=count)
        {
            System.out.println("No such element");
            System.exit(0);
        }
        for(int i=index;i<count;i++)
        items[i]=items[i+1];
        --count;
    }
    public int indexOf(int item)
    {
        for(int i=0;i<count;i++)
            if(items[i] == item)
                return i;

            return -1;
    }
    public void print()
    {
        for(int i=0;i<count;i++)
        System.out.println(items[i]);
    }
}
