/* 28. Implement two stacks in a single array. Write its algorithm, program. Find its time and 
space complexities. */


public class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;

    // Constructor
    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = n;
    }

    // Push to Stack 1
    public void push1(int x) {
        if (top1 + 1 < top2) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow in Stack 1");
        }
    }

    // Push to Stack 2
    public void push2(int x) {
        if (top2 - 1 > top1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow in Stack 2");
        }
    }

    // Pop from Stack 1
    public int pop1() {
        if (top1 >= 0) {
            return arr[top1--];
        } else {
            System.out.println("Stack Underflow in Stack 1");
            return -1;
        }
    }

    // Pop from Stack 2
    public int pop2() {
        if (top2 < size) {
            return arr[top2++];
        } else {
            System.out.println("Stack Underflow in Stack 2");
            return -1;
        }
    }

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);
        ts.push1(1);
        ts.push1(2);
        ts.push1(3);

        ts.push2(100);
        ts.push2(200);
        ts.push2(300);

        System.out.println("Pop from Stack 1: " + ts.pop1());
        System.out.println("Pop from Stack 2: " + ts.pop2());
    }
}


//TC - O(1)
//SC - O(N)
