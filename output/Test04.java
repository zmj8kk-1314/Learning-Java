public class Test04 {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;
        System.out.println("反转前的单链表为：");
        Node p = first;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
        System.out.println("null");
        Node newfirst =reverse(first);
        System.out.println("反转后的单链表为：");
        p = newfirst;
        while (p != null) {
            System.out.print(p.data + " -> ");
            p = p.next;
        }
         System.out.println("null");
    }
static Node reverse(Node first){
    Node prev=null;
    Node cur=first;
    while (cur!=null) {
        Node next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
    }
    return prev;
}
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}