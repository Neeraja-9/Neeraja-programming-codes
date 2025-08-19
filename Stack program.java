import java.util.*;
public class stackProgram{
    public static void main(String[] args){
        Stack<Integer>Stack=new Stack<>();
        Stack.push(9);
        Stack.push(11);
        Stack.push(26);
        Stack.push(30);
        Stack.push(69);
        System.out.println(Stack);
        Stack.pop();
        System.out.println(Stack);
        System.out.println("Top Element: "+Stack.peek());
    }
}