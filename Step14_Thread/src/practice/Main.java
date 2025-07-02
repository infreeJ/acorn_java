package practice;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> { // Thread 생성
            for (int i = 0; i < 100; i++) System.out.println("Thread 1");
        });
        t1.start();

        for (int i = 0; i < 100; i++) System.out.println("Main Thread");
    }
}
