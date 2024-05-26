package homework_01;

public class MyThread2 extends Thread{

    @Override
    public void run() {
        for (int i = 1_000_000; i <= 2_000_000; i++){
            if (Main.isDivisibleBy21(i) && Main.doesContainNumberThree(i)) {
                Main.increment();
            }
        }
    }
}
