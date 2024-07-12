class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 10) {
            System.out.println("I am Thread1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 10) {
            System.out.println("I am Thread2!!!");
            i++;
        }
    }
}

public class By_Runnable_Interface {
    public static void main(String[] args) {
        MyThreadRunnable1 obj1 = new MyThreadRunnable1();
        Thread t1 = new Thread(obj1);

        MyThreadRunnable2 obj2 = new MyThreadRunnable2();
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
