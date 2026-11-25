public class Test05 {
    public static void main(String[] args) {
        DNode head = new DNode(0);
        DNode tail = new DNode(0);
        head.next = tail;
        tail.prev = head;

        DNode ten = new DNode(10);
        DNode twenty = new DNode(20);
        DNode thirty = new DNode(30);

        printBoth(head, tail);

        insertBefore(tail, ten);
        insertBefore(tail, thirty);
        insertBefore(thirty, twenty);
        printBoth(head, tail);

        remove(twenty);
        printBoth(head, tail);

        remove(ten);
        printBoth(head, tail);
        
        remove(thirty);
        printBoth(head, tail);

        DNode zero=new DNode(0);
        insertBefore(tail,zero);
        printBoth(head, tail);
    }

    static void insertBefore(DNode right, DNode node) {
        //找到 right 的左邻居，接入 node。
        node.prev=right.prev;
        node.next=right;
        right.prev.next=node;
        right.prev=node;
    }

    static void remove(DNode node) {
        //找到 node 的两个邻居，把它们接起来。
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    static void printBoth(DNode head, DNode tail) {
        for (DNode current = head.next; current != tail; current = current.next) {
            System.out.print(current.data + " ");
        }
        System.out.println("| 正向");

        for (DNode current = tail.prev; current != head; current = current.prev) {
            System.out.print(current.data + " ");
        }
        System.out.println("| 反向");
    }
}

class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int data) {
        this.data = data;
    }
}