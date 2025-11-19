import java.util.*;

class Node {
    int data;
    Node Next;

    Node(int data1, Node Next1) {
        data = data1;
        Next = Next1;
    }

    Node(int data1) {
        data = data1;
        Next = null;
    }
}

public class ArrToLl {
        static Node ArrToL(int arr[]) {
        Node head = new Node(arr[0]);
        Node Mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            Mover.Next = temp; // ye temp pe pointer move kar raha hai
            Mover = temp;
        }
        return head;

    }

    public static void main(String[] args) {
        int arr[] = { 12, 15, 14, 16 };
        Node head =ArrToL(arr);
       // System.out.println(head.data);
        Traversal(head);
    }
//Traversal in a node.......................................
static void Traversal(Node head){
    Node temp=head;
    while (temp!=null) {
      
        System.out.println(temp.data);
             temp=temp.Next;    
    }
    

}

}


