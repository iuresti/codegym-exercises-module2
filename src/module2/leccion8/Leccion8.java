package module2.leccion8;

import module2.leccion2.Animal;
import module2.leccion2.Chihuahua;

public class Leccion8 {

    private int a = getSum();
    private int b = a + 10;
    private int c = a + b - 5;

    public int getSum() {
        return a + b + c;
    }


    public static void main(String[] args) throws ClassNotFoundException {
        Leccion8 leccion8 = new Leccion8();
        Animal []animal1 = new Animal[10];

        Class objetoClass = Class.forName("module2.leccion2.Chihuahua");


        System.out.println(leccion8);
    }


}
