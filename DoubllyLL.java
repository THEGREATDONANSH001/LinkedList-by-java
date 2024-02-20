public class DoubllyLL{
    public class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.next=null;
            this.data=data;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    //add
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }


    public int removeFirst(){
        if(head==null){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(head==tail){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        return val;
    }


    public int removeLast(){
        if(head==null){
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(head==tail){
            int val=tail.data;
            head=tail=null;
            return Integer.MIN_VALUE;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        return val;
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
        DoubllyLL ll=new DoubllyLL();
        ll.print();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        // ll.addLast(6);
        // ll.addLast(7);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Addlast is used");
        ll.print();
    }
}