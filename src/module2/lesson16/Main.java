package module2.lesson16;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        String fileName = "ejemplo3.bin";
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);


        Rate rate1 = (Rate)ois.readObject();
        Rate rate2 = (Rate)ois.readObject();

        ois.close();
    }

    public static void main1(String[] args) throws Exception {
        Rate rate1 = new Rate("NDD", LocalDate.now(), LocalDate.now().plusYears(2), new BigDecimal("1000.00"));
        Rate rate2 = new Rate("NQ", LocalDate.now(), LocalDate.now().plusYears(1), new BigDecimal("1100.00"));
        String fileName = "ejemplo3.bin";
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        rate1.setOtraCosa("Valor X");
        rate2.setOtraCosa("Valor Y");

        oos.writeObject(rate1);
        oos.writeObject(rate2);

        oos.close();
    }
}
