package partThread;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //1 способ
        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();

        System.out.println("I am going to sleep");
        Thread.sleep(3000);
        System.out.println("I am awake!");

        //2 способ
        Thread thread = new Thread(new Runner());
        thread.start();

        System.out.println("hello from class main");

    }
}

class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }
}

class MyThread extends Thread {
    //теперь этот класс - отдельный поток, кот будет выполняться парал с main
    public void run() {
        for (int i = 0; i <= 10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread" + i);
        }
    }

}