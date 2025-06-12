
// Queue 

import java.util.Queue;
import java.util.LinkedList;
class Prog86 {
    
    public static void main(String[] args) {
        

        Queue<Integer> s = new LinkedList<Integer>();


        s.offer(10);
        s.offer(20);
        s.offer(30);

        s.add(10);
        s.add(20);
        s.add(30);

        System.out.println(s.peek());
        System.out.println(s.element());

        System.out.println(s);

        System.out.println(s.remove());
        System.out.println(s.poll());
        System.err.println(s);
    }
}
