import java.util.*;
public class queueProgram {
    public static void main(String[] args){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(11);
        queue.add(22);
        queue.add(33);
        queue.add(44);
        queue.add(55);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);
    }
}
