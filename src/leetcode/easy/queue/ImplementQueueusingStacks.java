package leetcode.easy.queue;

import java.util.Stack;

public class ImplementQueueusingStacks {
    public static void main(String[] args) {
        int i = 99999999;
     while (true) {
         i = i * i;
         System.out.println(i);
     }
    }

}

class MyQueue {

    private Stack<Integer> mainStack;
    private Stack<Integer> tmpStack;

    public MyQueue() {
        mainStack = new Stack<>();
        tmpStack = new Stack<>();
    }

    public void push(int x) {
        while (!mainStack.empty()) {
            tmpStack.add(mainStack.pop());
        }
        mainStack.add(x);

        while (!tmpStack.empty()) {
            mainStack.add(tmpStack.pop());
        }
    }

    public int pop() {
        return mainStack.pop();
    }

    public int peek() {
        return mainStack.peek();
    }

    public boolean empty() {
        return mainStack.empty();
    }
}