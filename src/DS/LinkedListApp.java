package DS;

class Node11 {
  Node11 next;
  int data;
}

class Linked {
  /*
   * It checks if two linked lists are identical
   */
  public boolean ifIdenticalLists(Node11 Node111, Node11 Node112) {
    while(Node111 != null && Node112 != null) {
      if(Node111.data != Node112.data) {
        return false;
      }
      
      Node111 = Node111.next;
      Node112 = Node112.next;
    }
    
    return (Node111 == null && Node112 == null);
  }
    
  /*
   * getNewNode11() method to generate a new Node11
   */
  public Node11 getNewNode11(int key) {
    Node11 a = new Node11();
    a.next = null;
    a.data = key;
    return a;
  }

  /*
   * insert method is used to insert the element in Linked List
   */
  public Node11 insert(int key, Node11 Node11) {

    if (Node11 == null)
      return getNewNode11(key);
    else
      Node11.next = insert(key, Node11.next);

    return Node11;
  }

  /*
   * It'll print the complete linked list
   */
  public void printList(Node11 Node11) {
    if (Node11 == null) {
      return;
    }

    System.out.print(Node11.data + " ");
    printList(Node11.next);
  }
}

public class LinkedListApp {

  public static void main(String[] args) {

    Node11 head1 = null;
    Linked a = new Linked();

    head1 = a.insert(12, head1);
    head1 = a.insert(99, head1);
    head1 = a.insert(8, head1);
    head1 = a.insert(39, head1);
    head1 = a.insert(5, head1);
    
    a.printList(head1);
    System.out.println();
    
    Node11 head2 = null;
    
    head2 = a.insert(12, head2);
    head2 = a.insert(99, head2);
    head2 = a.insert(8, head2);
    head2 = a.insert(39, head2);
    head2 = a.insert(5, head2);
    
    a.printList(head2);
    System.out.println();
    
    System.out.println(a.ifIdenticalLists(head1, head2));
  }
}