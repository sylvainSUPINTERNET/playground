public class Main {
    public static void main(String args[]) {
class Node {
         String data;
         Node next = null;

         public Node(String data) {
            this.data = data;
         }

         public Node next() {
            return this.next;
         }
         
         public String getData(){
            return this.data;
         }
      }


       class SinglyLinkedList {
         public Node head = null;
         public Node tail = null;
         public int count = 0;

         public SinglyLinkedList(){
         }

         public int getCount() {
            return this.count;
         }

         public Node addNode(String data){
            Node node = new Node(data);
            this.count++;

            if ( this.head == null ) {
               this.head = node;
            } else {
               if ( count == 2 ) {
                  this.head.next = node;
                  this.tail = node;
               } else {
                  Node old = this.tail;
                  old.next = node;
                  this.tail = node;
               }
            }

            return node;

         }
      }

      SinglyLinkedList ld = new SinglyLinkedList();
      ld.addNode("Im head");
      ld.addNode("Im body");
      ld.addNode("Im tail");
      System.out.println(ld.head.data);
      System.out.println(ld.head.next.data);
      System.out.println(ld.head.next.next.data);
      System.out.println(ld.head.next.next.next); // null ofc
      System.out.println(ld.getCount());
    }
}

