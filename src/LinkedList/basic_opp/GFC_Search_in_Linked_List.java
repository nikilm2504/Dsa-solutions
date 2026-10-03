package LinkedList.basic_opp;
public class GFC_Search_in_Linked_List {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        }
        static boolean find(Node head, int key){
            Node current = head;

            while (current!= null) {
                if(current.data == key){
                  return true;
                };
                current = current.next;
            }

            return false;
        }
        public static void main(String[] args){
          Node head = new Node(10) ;
            head.next = new Node(20);
            head.next.next = new Node(30);
            head.next.next.next = new Node(40);
            int key=30;
            boolean result=find(head,key);
            System.out.println(result);
        }
    }

