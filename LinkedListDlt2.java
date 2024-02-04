class LinkedListDlt2{
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

    public void addLast(int data){
        Node nN=new Node(data);
        if(head==null){
            head=tail=nN;
            return;
        }
        tail.next=nN;
        tail=nN;
        size++;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Linked list is Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-1;i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }


    public void print(){
        if(head==null){
            System.out.println("Linked list is empty.");
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
        LinkedListDlt2 ll=new LinkedListDlt2();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        ll.removeLast();
        ll.print();
    }
}