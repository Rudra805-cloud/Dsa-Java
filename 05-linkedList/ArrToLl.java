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
        
       //Insertion of  Element in Linked list
        head= AddElement(30,head,1);
     // System.out.println(head.data);
        Traversal(head);
       
       
    }
//Traversal in a node.......................................
static void Traversal(Node head){
    Node temp=head;
    while(temp!=null) {
        System.out.println(temp.data);
             temp=temp.Next;    
    }
}

//iNSERT ELEMENT
public static Node AddElement(int data,Node head,int pos){
     Node element=new Node(data);
     if (pos==0){
        element.Next=head;
        
        return element;
     }
     Node pre=head;
     for(int i=0;i<pos-1;i++){
          pre=pre.Next;                                                   
     }
     element.Next=pre.Next;
     pre.Next=element;
     
     return head;
}
}




