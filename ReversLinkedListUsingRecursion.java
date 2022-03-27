import java.util.*;
public class ReversLinkedListUsingRecursion{
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        Node n4=new Node(50);
        Node n5=new Node(60);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        BasicLogic b=new BasicLogic();
        Node i=b.reverse(head);
        
        System.out.println(i.data);
        
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;

    }
}
class BasicLogic{
    Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
            Node newHead=reverse(head.next);
            Node headNext=head.next;
            headNext.next=head;
            head.next=null;
            return newHead;
        }
}


