package module2.leccion9;

import module2.leccion6.Alumno;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {
        String hola1 = new String("hola");
        String hola2 = new String("hola");

        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();

        alumno1.setName("David");
        alumno1.setClave("10");
        alumno2.setName("David");
        alumno2.setClave("10");

        System.out.println(alumno1);
        System.out.println(alumno2);

        System.out.println(alumno1.equals(alumno2));

        alumno1.añadeCalificacion("10");
        alumno1.añadeCalificacion(", 8");

        Alumno alumno3 = alumno1.clone();

        System.out.println(alumno3);
        System.out.println(alumno3 == alumno1);

        alumno3.nameToUpperCase();
        alumno3.añadeCalificacion(",9");

        Class info = alumno1.getClass();

        Class info2 = Alumno.class;

        System.out.println(info == info2);

        alumno1.setClave("123");
        alumno1.setName("algo");

        String valor = "Hola"; // inmutable

        System.out.println(valor.toUpperCase());
        System.out.println(valor);



    }
}
