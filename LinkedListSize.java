class LinkedListSize{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }


    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        LinkedListSize ll=new LinkedListSize();
        ll.addLast(3);
        ll.addFirst(2);
        ll.addLast(4);
        ll.addFirst(1);
        ll.addLast(5);
        ll.addFirst(0);
        ll.print();
        System.out.println("Size of linkedlist is: "+size);
    }
}