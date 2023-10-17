package module2.lesson12;

import javax.naming.SizeLimitExceededException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    static Queue<String> alumnos = new LinkedList<>(Arrays.asList("Mario", "Luisa"));
    static Object object = new Object();

    private volatile int dato;


    public static void main(String[] args) throws InterruptedException {



        CountDown thread1 = new CountDown("C1", 1000);
        CountDown thread2 = new CountDown("C2", 1000);

        // Productor - consumidor

        System.out.println("Iniciando");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Finalizó");
    }

}
