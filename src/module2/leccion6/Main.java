package module2.leccion6;

import java.util.*;
import java.util.function.Consumer;

@FunctionalInterface
interface PruebaDeFunctionalInterface {
    default void metodo(int a) {

    }

    void metodo2(int a, int b);
}

class ConsumerString implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

public class Main {




    public static void main(String[] args) {

        int []datos = new int[10];

        int length = datos.length;

        ArrayList<Integer> datosInt = new ArrayList<>();

        datosInt.size();

        String algo = "";

        Object otro = algo;

        algo.toUpperCase();

        String otraVezString = (String)otro;

        System.out.println(algo instanceof CharSequence);


        List<Integer> enteros = Arrays.asList(8, 1, 9, 5, 2, 3);

        List<Integer> enteros2 = Arrays.asList();

        List<String> strings = Arrays.asList("8", "1", "9", "5", "2", "3");


        enteros
                .stream()
                .filter(dato -> dato > 10)
                .sorted()
                .max((a, b) -> a - b)
                .ifPresent(dato -> System.out.println(dato));


        Collections.sort(strings);

        for (String dato : strings) {
            System.out.println(dato);
        }

        List<Alumno> alumnos = new ArrayList<>();

        Collections.sort(alumnos);

        Collections.sort(alumnos, (o1, o2) -> o1.getClave().compareTo(o2.getClave())); // Clase anónima

        Collections.sort(alumnos, Comparator.comparing(Alumno::getClave));

        //sugea


        unaPruebaDeInterfazFuncional(new PruebaDeFunctionalInterface() {
            @Override
            public void metodo2(int a, int b) {
                pruebaDeMethodReference(a, b);
            }
        });

        unaPruebaDeInterfazFuncional((primerParametro, segundoParametro) -> pruebaDeMethodReference(primerParametro, segundoParametro));

    }

    public static void pruebaDeMethodReference(int a1, int a2) {

    }

    public static void unaPruebaDeInterfazFuncional(PruebaDeFunctionalInterface prueba) {
        prueba.metodo(10);

        prueba.metodo2(10, 20);
    }
}
