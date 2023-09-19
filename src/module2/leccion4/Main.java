package module2.leccion4;

public class Main {


    // Abstract Factory
    // Factory

    // Creacionales, Estructurales y de Comportamiento

    public static void main(String[] args) {
        ReportCreator reportCreator = new ReportCreator();

        reportCreator.create(FormatterFactory.getInstance(args));


        PdfFormatter formatter = new PdfFormatter();

        formatter.createPdfHeader();

        Perro perro = new Perro();

        perro.caminar();

        Tiburon tiburon = new Tiburon();

        tiburon.nadar();

        aVolar(new Pato());
        aCorrer(new Pato());
    }

    public static void aVolar(Volador volador){
        volador.volar();
    }

    public static void aCorrer(Caminador deLaTierra){

    }
}
