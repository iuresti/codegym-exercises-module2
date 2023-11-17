package module2.lesson18;


import java.io.Serializable;
import java.lang.annotation.Annotation;


public class Main {

    private int dato;

    public static void main(String[] args) {

        new Main().operacion();

    }

    void operacion(){
        Person2 person = new Person2("Mario", 10, 10, 30, 40, 10);
        Person2 person2 = new Person2();

        Person2 mirna = Person2.builder()
                .magic(10)
                .name("Mirna")
                .defense(100)
                .attack(1000)
                .live(500)
                .build();

        person2.setLive(10);


        System.out.println(person);
    }


}
