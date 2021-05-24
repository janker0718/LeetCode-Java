package cc.janker.algorithm;

public class ReverseList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode iterate(ListNode head){
            //curr后移 prev作为新链表
            ListNode prev = null,next;
            ListNode curr = head;
            while (curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }
            return prev;
        }

        public static ListNode recursion(ListNode head){
            if (head == null || head.next == null){
                return head;
            }
            ListNode newHead = recursion(head.next);
            head.next.next = head;
            head.next = null;
            return newHead;
        }

        public static void main(String[] args) {
            ListNode node5 = new ListNode(5,null);
            ListNode node4 = new ListNode(4,node5);
            ListNode node3 = new ListNode(3,node4);
            ListNode node2 = new ListNode(2,node3);
            ListNode node1 = new ListNode(1,node2);
//            ListNode iterate = iterate(node1);
            ListNode recursion = recursion(node1);
//            System.out.println(iterate);
            System.out.println(recursion);
        }
    }
}
