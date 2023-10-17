package module2.lesson12;

public class CountDown extends Thread {
    private final String name;
    private final long sleepTime;

    public CountDown(String name, long sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }


}
