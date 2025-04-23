/* 13. How to merge two sorted linked lists into one sorted list. Write its algorithm, program. 
Find its time and space complexities.  */


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class MergeSortedLists {
    
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify edge cases.
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Traverse both lists while both lists are not empty.
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;  // Add l1 node to the merged list.
                l1 = l1.next;       // Move the l1 pointer.
            } else {
                current.next = l2;  // Add l2 node to the merged list.
                l2 = l2.next;       // Move the l2 pointer.
            }
            current = current.next;  // Move the current pointer.
        }

        // If any elements remain in l1 or l2, append them.
        if (l1 != null) {
            current.next = l1;
        } else if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;  // Return the merged list starting from dummy.next.
    }
    
    // Helper method to print the list.
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create first sorted linked list: 1 -> 2 -> 4
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        // Create second sorted linked list: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // Merge the lists
        ListNode mergedList = mergeTwoLists(l1, l2);

        // Print the merged list
        printList(mergedList);
    }
}


//TC - O(n+m)
//SC - O(1)
