package module2.leccion7;

public class Main {

    public static void main(String[] args) {

        String variable = "D";

        System.out.println(switch(variable){
            case "A", "B" -> 100;
            case "C" -> 1000;
            case "D" -> {
                int len = variable.length();

                len++;

                yield len;
            }
            default -> 0;
        });



    }

    public static void metodo(Object dato){

        if(dato instanceof String datoString){
            System.out.println(datoString.toUpperCase());
        }
    }
}
