class LinkedListDlt3{
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

    public void deleteNfromEnd(int key){
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(key==sz){
            head=head.next;
            return;
        }
        int i=1;
        int iToFind=sz-key;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public void addFirst(int data){
        Node nN=new Node(data);
        if(head==null){
            head=tail=nN;
            return;
        }
        nN.next=head;
        head=nN;
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
        LinkedListDlt3 ll=new LinkedListDlt3();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(0);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.deleteNfromEnd(4);
        ll.print();
    }
}