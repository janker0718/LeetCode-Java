# [21. 合并两个有序链表](https://leetcode-cn.com/problems/merge-two-sorted-lists/)
***
### 思路一：迭代
1. 建立一个哑节点dummy，指向新链表头节点
2. 遍历两个链表，让当前节点cur指向较小的节点，该链表再后移一位
3. 循环结束时，让cur指向还非空的链表
4. 返回dummy.next

### 代码
```java []
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                cur.next = l1;   
                l1 = l1.next;
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}
```

**复杂度分析**
- 时间复杂度：O(m + n)
- 空间复杂度：O(1)
***
### 思路二：递归
1. 递归少不了处理特例，因为这是递归中止的条件：如果一个链表为空，返回另一个链表
2. 如果一个链表的头节点值更小，那么该头节点将作为新链表的头节点
3. 先将该头节点指向去除头节点后的剩余链表和另一链表的头节点，然后返回该头节点
4. 递归就是不断找头节点的过程
### 代码
```java []
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }else if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
```

**复杂度分析**
- 时间复杂度：O(m + n)
- 空间复杂度：O(m + n)