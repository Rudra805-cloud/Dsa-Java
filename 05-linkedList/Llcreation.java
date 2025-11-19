import java.util.*;

// class Node{
//     int data;  //value (data)
//     Node next; //pointer to next element memory addresh
//         Node(int data){
//             this.data=data;
//         }
//     }
//||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
//also create node like that
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        data=data1;
        next=next1;
    }
    Node(int data1){
        data=data1;
        next=null;
    }

    
}
public class Llcreation {
    
    public static void main(String[] args) {
        int arr[]={12,13,13,134};
        Node n1=new Node(10);
        System.out.println(n1);
    
    }
}


