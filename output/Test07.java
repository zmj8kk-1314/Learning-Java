public class Test07 {
    public static void main(String[] args) {
        printCircle(buildCircle(5));       // 1 2 3 4 5
        printCircle(buildCircle(1));       // 1
        printCircle(buildCircle(0));       // 空表

        System.out.println(survivor(3, 5)); // 3
    }

    // n >= 0，返回编号 1 的结点。n 为 0 时返回 null。
    static CircleNode buildCircle(int n) {
        if (n == 0) {
            return null;
        }

        CircleNode first = new CircleNode(1);
        CircleNode last = first;
        for (int i = 1; i < n; i++) {
            last.next = new CircleNode(i + 1);
            last = last.next;
        }
        last.next = first;
        return first;
    }

    static void printCircle(CircleNode first) {
        // TODO 空表打印“空表”。非空表打印一圈后换行。
        if(first==null){
            System.out.println("空表");
            return;}
        CircleNode current=first;
        do{
            System.out.print(current.value+" ");
            current=current.next;    
    }while(current!=first);
    System.out.println(" ");
    }
    // n >= 1 且 k >= 1，返回最后留下的人的编号。
    static int survivor(int n, int k) {
        CircleNode cur = buildCircle(n);
        CircleNode prev = cur;
        while (prev.next != cur) {
            prev = prev.next;
        }

        int remaining = n;
        // TODO 当 remaining > 1 时，移动 prev 和 cur，找到本轮出圈者。
        // TODO 改链接，更新 cur 和 remaining，然后开始下一轮。
        while(remaining>1){
            for(int i=1;i<k;i++){
                prev=cur;
                cur=cur.next;
            }
           prev.next=cur.next;
           cur=cur.next;
        remaining--; 
    }
        return cur.value;
}
}
class CircleNode {
    int value;
    CircleNode next;

    CircleNode(int value) {
        this.value = value;
    }
}

