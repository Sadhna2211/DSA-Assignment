/* 27 / 49. Find the node where two singly linked lists intersect.  Write its algorithm, program. 
Find its time and space complexities.  */



// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class LinkedListIntersection {
    
    // Function to find the intersection node of two singly linked lists
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either list is empty, no intersection
        if (headA == null || headB == null) {
            return null;
        }
        
        // Step 1: Find the lengths of both lists
        ListNode currA = headA, currB = headB;
        int lenA = 0, lenB = 0;
        
        while (currA != null) {
            lenA++;
            currA = currA.next;
        }
        
        while (currB != null) {
            lenB++;
            currB = currB.next;
        }
        
        // Step 2: Align the two pointers to the same starting point
        currA = headA;
        currB = headB;
        
        // Move the pointer of the longer list forward by the length difference
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                currA = currA.next;
            }
        } else if (lenB > lenA) {
            for (int i = 0; i < lenB - lenA; i++) {
                currB = currB.next;
            }
        }
        
        // Step 3: Traverse both lists simultaneously
        while (currA != null && currB != null) {
            if (currA == currB) {
                return currA; // Found intersection
            }
            currA = currA.next;
            currB = currB.next;
        }
        
        return null; // No intersection
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
        // Create first linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);

        // Create second linked list: 9 -> 8 -> (intersection at 3)
        ListNode headB = new ListNode(9);
        headB.next = new ListNode(8);
        headB.next.next = headA.next.next;  // Intersection at node with value 3

        // Find the intersection node
        ListNode intersection = getIntersectionNode(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}


//TC - O(n+m)
//SC - O(1)
