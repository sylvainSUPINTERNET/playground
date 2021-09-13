public class Main {
    public static void main(String args[]) {
class Node {
         String data;
         Node next = null;
         Node parent = null;

         public Node(String data) {
            this.data = data;
         }
         
         public Node parent() {
            return this.parent;
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
         
         public void removeNode() {
            this.count = count--;
            if ( count <= 0 ) {
                this.count = 0;
                this.head = null;
                this.tail = null;
            } else if ( count == 1 ) {
                this.head.next = null;
                this.tail = null;
            } else {
                Node last = this.tail;
                Node newLast = last.parent;
                newLast.next = null;
                this.tail = newLast;
            }
         }

         public Node addNode(String data){
            Node node = new Node(data);
            this.count++;

            if ( this.head == null ) {
                node.parent = null;
               this.head = node;
            } else {
               if ( count == 2 ) {
                   node.parent = this.head;
                   
                  this.head.next = node;
                  this.tail = node;
               } else {
                  Node old = this.tail;
                  node.parent = old;
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
      //System.out.println(ld.head.next.parent.data); // display im head 
      System.out.println(ld.head.next.next.data);
      System.out.println(ld.head.next.next.next); // null ofc
      System.out.println(ld.getCount());
      
/*      ld.removeNode();
      System.out.println(ld.tail.data); // im body */
    }
}

