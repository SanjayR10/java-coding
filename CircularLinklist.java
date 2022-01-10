package Doubly_LinkList;

public class CircularLinklist {

    Node head;
    int count=-1;
    //Node last;

    private class Node
    {
         private  int data;
         private Node previous,next;
        Node(int item)
        {
            this.data=item;
            this.previous=this.next=null;
        }
    }

    public void addLast(int data)
    {
        ++count;
        var node =new Node(data);
        if(head == null)
        {
           head=node;
           node.previous=head;
           node.next=null;
        }
        else
        {
            Node n=head;
            while(n.next!=null){
            n=n.next;}
              n.next=node;
              n.previous=n;
        }
    }

    public void showList()
    {
        if(head==null)
            System.out.println("List is empty");
        else{
            Node n=head;
            while(n.next!=null)
            {
               System.out.print(n.data+" ");
               n=n.next;
            }
            System.out.print(n.data+" ");
        }
    }

    public void deleteLast() {
        if (head == null)
            System.out.println("No Elements to detelete");
        else if (head.next == null)
        {
            --count;
            head = null;
        }
        else {
            --count;
            Node n = head;
            while (n.next.next != null)
                n = n.next;

            n.next= null;
        }
    }

  public void lengthList()
    {
        System.out.println("Length of list: "+(count+1));
    }

    public void addBegin(int data)
    {
        ++count;
        Node node=new Node(data);
        if(head==null) {
            head = node;
            node.previous = head;
            node.next = null;
        }
        else
        {
        Node n=head;
        head=node;
        node.next=n;
        node.previous=head;
        n.previous=node;
        }
    }

    public void deleteBegin()
    {
        if(head==null)
            System.out.println("No elements in list");
        else if(count==1)
        {
            --count;
            head=null;
        }
        else
        {
            --count;
            head=head.next;
            head.previous=head;
        }
    }

    public void insertAt(int index,int data)
    {
        if(index<0 && index>count)
            System.out.println("Wrong index ");
        else if(index==0)
            deleteBegin();
        else
        {
            --count;
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;

        }
    }
}
