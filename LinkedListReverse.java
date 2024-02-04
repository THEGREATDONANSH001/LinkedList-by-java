class LinkedListReverse{
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

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void addLast(int data){
        Node nN=new Node(data);
        if(head==null){
           head=tail=nN;
           return;
        }
        tail.next=nN;
        tail=nN;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked list is Empty.");
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
        LinkedListReverse lr=new LinkedListReverse();
        lr.addLast(1);
        lr.addLast(2);
        lr.addLast(3);
        lr.addLast(4);
        lr.addLast(5);
        lr.print();
        lr.reverse();
        lr.print();
    }
}