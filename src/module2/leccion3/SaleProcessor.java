package module2.leccion3;

public class SaleProcessor extends TransactionProcessor {


    public void doTransaction(String amount, String card){

        validateCard(card);

        System.out.println("Hago venta");

        System.out.println(url);
    }
}
