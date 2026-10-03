package LinkedList.basic_opp;

public class Insert_at_nth_position {

        public Node insertAtEnd(Node head, int x) {
            // code here
            Node newNode = new Node(x);
            if(head==null){
                return newNode;
            }
            Node current = head;

            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
            return head;
        }
    }

