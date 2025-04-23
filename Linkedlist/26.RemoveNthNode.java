/* 26. Remove the n-th node from the end of a singly linked list. Write its algorithm, program. 
Find its time and space complexities. */


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class RemoveNthFromEnd {
    
    // Function to remove the n-th node from the end of a singly linked list
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases like removing the head node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize two pointers
        ListNode first = dummy;
        ListNode second = dummy;
        
        // Move the first pointer n+1 steps ahead to maintain the gap
        for (int i = 0; i <= n; i++) {
            if (first == null) return null; // If n is larger than the length of the list
            first = first.next;
        }
        
        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // Remove the n-th node from the end
        second.next = second.next.next;
        
        // Return the new head (dummy.next is the actual head of the list)
        return dummy.next;
    }
    
    // Helper function to print the list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print original list
        System.out.println("Original List:");
        printList(head);

        // Remove 2nd node from the end (n = 2)
        head = removeNthFromEnd(head, 2);

        // Print the modified list
        System.out.println("List after removal:");
        printList(head);
    }
}


//TC - O(L)
//SC - O(1)
