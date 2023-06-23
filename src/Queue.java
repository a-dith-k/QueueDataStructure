public class Queue {

        private Node rear=null;
        private Node front=null;

        private static  class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
            }
        }

        public void enqueue(int data){
            Node newNode =new Node(data);

            if(rear==null){
                rear=newNode;
                rear=front=newNode;

            }else{
                rear.next=newNode;
                rear=newNode;
            }

        }


        public void dequeue(){
            if(front==null){
                System.out.println("queue is empty");
                return;
            }
                front=front.next;

            if(front==null){
                rear=null;
            }
        }

        public void printQueue(){
            Node temp=front;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }

        }

}
