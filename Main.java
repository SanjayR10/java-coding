package Simple_linked_list;

public class Main {
    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();

        list.insertLast(1);
        list.insertLast(12);
        list.insertLast(13);
        list.insertLast(1213);
        list.insertLast(1213);
        list.print();

        list.reverse();
        list.print();
    }
}
