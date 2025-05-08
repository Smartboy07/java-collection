import java.util.LinkedList;
import java.util.Stack;

/*
Stack is a class which extends Vector class
it will use the LIFO principle to store the data
When we want Last inserted element to out first then we will go for stack
since stack extends vector it's synchronized making it thread safe
In stack we have push() method to add and pop() to remove and peek() to see the top element.
search() method will return 1 based index value if the search element found assume if element found at index 0 it will return 1 as it's 1 based
As it's extending vector we can use all it's method like add remove
we can use LinkedList and arrayList also as stack But we don't have dedicated method to do that we are externally can achive
 */
public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack.search(3));
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        //LL as stack
        LinkedList<Integer> stackLl = new LinkedList<>();
        stackLl.addLast(1);
        stackLl.addLast(2);
        stackLl.addLast(3);
        stackLl.getLast();//equivalent to peek
        stackLl.removeLast();//equivalent to pop

    }
}
