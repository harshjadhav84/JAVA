class MyThread1 extends Thread {
    @override
    public void run() {
        int i = 0;
        while(i<10){
            System.out.println("My cooking thread is running");
            System.out.println("I am happpy");
            i++;
        }
    }
}
class MyThread2 extends Thread {
    
    public void run() {
        int i = 0;
        while(i<10){
            System.out.println("thread2  chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}

class By_Extending {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}