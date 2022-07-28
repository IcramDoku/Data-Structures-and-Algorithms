package DataStructuresAndAlgorithms;
import java.util.Stack;

public class Stacks{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // stack = LIFO data structue. Last-In First-Out
        //         Stores objects into a sort of "verical tower"
        //         stack.push("object") to add to the top
        //         stack.pop() to remove from the top
        
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty()); //true

        stack.push ("Beat Saber");
        stack.push("Superhot");
        stack.push("Richie's Plank Experiment");
        stack.push("Population: ONE");

        System.out.println(stack.empty()); //false, it has objects in it
        // System.out.println(stack); //lists the objects [...]
    
        // stack.pop(); //remove the top object, aka Last-In on top of stack
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop(); //Exception becuse we tried to remove when the stack is empty

        // String myFavGame = stack.pop(); //assigns and Remove! b/c public synchronized E pop() {... return var1;}

        // System.out.println(stack);

        // System.out.println(myFavGame);

        // Instead of assigning string and removing just, use peek()
        System.out.println(stack.peek());
    
        System.out.println(stack.search("Population: ONE")); //Indexing top = 1
        System.out.println(stack.search("Beat Saber")); // Index = 4
        System.out.println(stack.search("Minecraft")); // DNE = -1
        
        // for(int i = 0; i < 10000000000; i++) {
        //     stack.push("fallout76");
        // } //can run out of memory! Exception will be thrown

    }
}