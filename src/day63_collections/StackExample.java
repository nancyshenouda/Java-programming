package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        //LIFO ( last in first out)
        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Leaders eat last");
        bookStack.add("java");
        bookStack.add("Bible");
        bookStack.push("Cucumber");
        System.out.println(bookStack);
        System.out.println("This is at the top of the stack = " + bookStack.peek()); // last one added to the stack
        //System.out.println(bookStack.remove(0));// removes the first index, we need to put the index
        //System.out.println("stack after pop = " + bookStack.pop());// returns the last added element and removes it
        System.out.println();
        System.out.println("Final version of books = " + bookStack);


    }
}
