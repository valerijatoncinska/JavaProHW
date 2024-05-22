package homework_01;

public class Main {

    public static long counterOneStream = 0;
    public static long counterTwoStreams = 0;
    public static synchronized void increment (){
        counterTwoStreams++;
    }

    public static void main(String[] args) {

        // работа с одним потоком
        for (int i = 0; i < 2_000_000; i++){
            if (isDivisibleBy21(i) && doesContainNumberThree(i)) {
                counterOneStream++;
            }
        }

        // создание и работа с двумя потоками
        MyThread myThread01 = new MyThread();
        MyThread myThread02 = new MyThread();

        myThread01.start();
        myThread02.start();

        try {
            myThread01.join();
            myThread02.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Значение счётчика одного потока - " + counterOneStream);
        System.out.println("Значение счётчика двух потоков - " + counterTwoStreams);
    }

    public static boolean isDivisibleBy21 (long number) {
        return number % 21 == 0;
    }

    public static boolean doesContainNumberThree (long number) {
      return (String.valueOf(number).contains("3"));
    }
}
