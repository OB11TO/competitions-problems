package leetcode.easy.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ImplementStackUsingQueues {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println();


        Integer peek = queue.peek();
        queue.poll();

        System.out.println();

        queue.add(5);

        System.out.println();


        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println();

        Integer peek1 = stack.peek();

        System.out.println();
        Integer pop = stack.pop();

        System.out.println();

        stack.push(5);
        System.out.println();


        MyStack myStack = new MyStack();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        int pop1 = myStack.pop();
        System.out.println();
    }
}

class MyStack {

    private Queue<Integer> tempQ;
    private Queue<Integer> mainQ;


    public MyStack() {
        tempQ = new LinkedList<>();
        mainQ = new LinkedList<>();
    }

    public void push(int x) {
        tempQ.offer(x);
        while (!mainQ.isEmpty()) {
            tempQ.offer(mainQ.poll());
        }
        Queue<Integer> swap = mainQ;
        mainQ = tempQ;
        tempQ = swap;
    }

    public int pop() {
        return Integer.valueOf(mainQ.poll());
    }

    public int top() {
        return Integer.valueOf(mainQ.peek());
    }

    public boolean empty() {
        return mainQ.isEmpty();
    }

}
