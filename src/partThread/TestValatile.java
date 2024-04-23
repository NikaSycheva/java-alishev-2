package partThread;

import java.util.Scanner;

public class TestValatile {
    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        myThread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread.shutdown();
    }
}

class MyThread2 extends Thread{
    private volatile boolean running = true;

    public void run(){
        while(running){
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown(){
        this.running = false;
    }
}
