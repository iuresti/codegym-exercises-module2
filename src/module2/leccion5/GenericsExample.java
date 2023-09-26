package module2.leccion5;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {


    public static void main(String[] args) {
        List<Cat> animals = new ArrayList<>();

        animals.add(new Cat());

        comer(animals);
    }

    public static void comer(List<? extends Animal> animales) {
        for (Animal a : animales) {
            a.comer();
        }
    }

    public static void procesa(String dato) {
        System.out.println(dato);
    }
}
