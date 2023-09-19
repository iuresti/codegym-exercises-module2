package module2.leccion4;

class PdfBase{
    public void createPdfHeader(){

    }
}

public class PdfFormatter extends PdfBase implements Formatter {


    public void createPdfHeader(){
        System.out.println("cambiado");
    }

    public void addTitle(String elReporte) {
        createPdfHeader();
    }

    @Override
    public void printLine(String line) {

    }

    @Override
    public void addFooter(String footer) {

    }
}
