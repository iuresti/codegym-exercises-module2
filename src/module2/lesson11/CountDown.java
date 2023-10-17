package module2.lesson11;

public class CountDown extends Thread {
    private final String name;
    private final long sleepTime;

    public CountDown(String name, long sleepTime) {
        this.name = name;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        for(int i = 100; i >= 0  && !isInterrupted()  ; i--){
            //try {
                //Thread.sleep(sleepTime);

            for(int x = 0; x < 100000&& !isInterrupted(); x ++){
                for(int y = 0; y < 100000&& !isInterrupted(); y ++){
                    for(int z = 0; z < 100000&& !isInterrupted(); z ++);
                }
            }

                System.out.println(name + ": " + i + ", " + isInterrupted());
//            } catch (InterruptedException e) {
//                System.out.println("El hilo fue interrumpido: " + isInterrupted());
//                break;
//            }
        }
    }
}
