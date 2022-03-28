public class LinkedList{
    
    Node head;
    
    public class Node{
        Node next;
        int data;
        public Node(int data){
            next=null;
            this.data = data;
        }
    }    

    public void append(int data){
        if(head==null){
            head = new Node(data);
            return;
        }

        Node current = head;
        while(current.next!=null){
            current = current.next;
        }

        current.next = new Node(data);
    }

    public void delete(int data){
        Node current = head;

        if(head.data == data){
            head=head.next;
        }else{
            while(current.next!=null){
                if(current.next.data == data){
                    current.next = current.next.next;
                }
                current = current.next;
            }
        }

    }

    void printList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"->");
            current = current.next;
        }
        System.out.print("\n");
    }

}