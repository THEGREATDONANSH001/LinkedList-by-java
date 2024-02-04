class LinkedListDlt1{
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node nN=new Node(data);
        if(head==null){
            head=tail=nN;
            return;
        }
        nN.next=head;
        head=nN;
        size++;
    }


    public int removeFirst(){
        if(head==null){
            System.out.println("Linked list is empty.");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }


    public void Print(){
        if(head==null){
            System.out.println("Linked lilst is empty");
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
        LinkedListDlt1 ll=new LinkedListDlt1();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.Print();
        ll.removeFirst();
        ll.Print();
    }
}