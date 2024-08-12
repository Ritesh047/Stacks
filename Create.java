import java.util.Stack;
import java.util.Iterator;


public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
   Stack<Integer> stack = new Stack<>();
   stack.push(10);
        stack.push(20);
        stack.push(30);
        
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
          Integer value = iterator.next();
          System.out.println(value); 
      }
}
}
