class SList
{
    Node head=null;


    public SListIterator iterator()
    {
        return new SListIterator(head);
    }
}

class Node
{
    int data;
    Node next;
    Node(int value)
    {
        data=value;
        next=null;
    }

}
class SListIterator<T>
{
    SList list=new SList();
    Node currentNode;
    SListIterator(Node node)
    {
        list.head=node;
        currentNode=node;
    }

    //insert node at given position
    public void add(int position,Integer data)
    {
        Node new_node = new Node(data);
        new_node.next = null;

        Node node=list.head;
        if(position==0)
        {
            new_node.next=list.head;
            list.head=new_node;
            currentNode=list.head;
        }
        else
        {


            int index=0;
            while(index!=position-1)
            {
                node=node.next;
                index++;
            }
            new_node.next=node.next;
            node.next=new_node;
        }
        System.out.println("node "+data+" added at "+position);
    }

    //insert node at the end
    public  void add(int data)
    {

        Node new_node = new Node(data);
        new_node.next = null;



        if(list.head==null)
        {

            currentNode=new_node;
            list.head=currentNode;
        }
        else
        {
            Node node=list.head;
            while(node.next!=null)
            {
                node=node.next;
            }
            node.next=new_node;

        }
        System.out.println("node data "+new_node.data);

    }


    //remove node at given position
    public void remove(int position)
    {
        if(list.head==null )
        {
            throw new IllegalStateException("list is empty");
        }
        else if(position==0)
        {
            list.head=currentNode.next;
            currentNode=list.head;
        }
        else
        {
            Node node=list.head;
            int index=0;
            while(index!=position-1)
            {

                node=node.next;
                index++;
            }
            Node temp=node.next;

            node.next=temp.next;



        }

        System.out.println("node removed at index "+position);
    }


    //returns current node value
    public Integer next()
    {
        Integer data=null;

        if(currentNode!=null)
        {
            data=currentNode.data;
            currentNode=currentNode.next;
        }
        else

            throw new IllegalStateException("node is null");


        return data;
    }



    //check next is null or not
    public boolean hasNext()
    {

        return currentNode!=null;

    }
}

public class LinkedList1 {


    public static void main(String[] args) {



        SList slist=new SList();
        SListIterator<Integer> iterator=slist.iterator();

        iterator.add(19);
        iterator.add(8);
        iterator.add(5);
        iterator.add(0,4);
        iterator.remove(2);

        System.out.println("List elements");
        while(iterator.hasNext())
        {

            System.out.println("value "+iterator.next());
        }
    }

}
