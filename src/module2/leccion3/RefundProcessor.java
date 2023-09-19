package module2.leccion3;

public class RefundProcessor extends TransactionProcessor{

    public void doTransaction(String amount, String card){

        validateCard(card);

        System.out.println("Hago devolución");
    }
}
