package module2.lesson11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //Thread thread1 = new Thread(new CountDown("C1"));
        //Thread thread2 = new Thread(new CountDown("C2"));
        CountDown thread1 = new CountDown("C1", 1000);
        CountDown thread2 = new CountDown("C2", 800);

        System.out.println("Iniciando");

        thread1.start();

        thread2.start();

        Scanner in = new Scanner(System.in);
        String input;

        while((input = in.nextLine() )!= null){
            if(input.trim().equals("X")){
                thread1.interrupt();
                thread2.interrupt();
                break;
            }
        }


        System.out.println("Finalizó");
    }

}
