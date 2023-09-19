package module2.leccion4;

public class ReportCreator {

    public void create(Formatter formatter) {

        formatter.addTitle("El reporte");

        formatter.printLine("Aquí va algo1");
        formatter.printLine("Aquí va algo2x");
        formatter.printLine("Aquí va algo3");
        formatter.printLine("Aquí va algo4");

        formatter.addFooter("El footer");

    }

}
