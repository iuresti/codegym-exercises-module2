package module2.lesson15;


import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

class Container{
    int []array = new int[1000];

    private static final String CONSTANTE = "una constante";

    public void setAt(int index, int dato){

    }

    public Iterator iterator(){
        return new Iterator(array);
    }


     private class Iterator{
        int currentIndex = 0;
         int []array;

        Iterator(int []array){
            this.array = array;
        }

        public boolean hasNext(){

            this.currentIndex ++;
            System.out.println(CONSTANTE);

            return currentIndex < array.length;
        }

        public int next(){
            return array[currentIndex++];
        }
    }

}

class IntComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}



public class Main { // Outer class

    volatile private int dato;

    AtomicInteger atomicInteger = new AtomicInteger(10);


    public void increase(int delta){

        int variable = dato; //10

        //otras operaciones

        dato = variable + 10;  // 20
    }


    public class InnerClass {

    }

    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });

        thread.start();



    }
}

class Otra{
    public void metodo(){
        Main.InnerClass innerClass = new Main().new InnerClass();
    }
}
