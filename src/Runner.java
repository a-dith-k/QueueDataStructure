public class Runner {


    public static void main(String[] args) {

        Queue queue=new Queue();
        queue.enqueue(181);
        queue.enqueue(127);
        queue.enqueue(17);
        queue.enqueue(16);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }
}
