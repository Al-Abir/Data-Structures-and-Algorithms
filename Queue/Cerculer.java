package Queue;

public class Cerculer {
    public static class Que {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Que(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front= -1;
        }

        public static boolean isEmpty() {
            return rear ==-1 && front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("This queue is full");
            } if(isEmpty()){
                front=0;
            }
                rear = (rear + 1)%size;
                arr[rear] = data;
            
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

             int result =  arr[front];

             if(rear==front){
                rear=front=-1;
             }else{
                front = (front+1)%size;
             }
             return result;
           
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Que q = new Que(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
