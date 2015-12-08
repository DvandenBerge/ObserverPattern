package observerpractice;

/**
 *
 * @author dvandenberge
 */
public class Seller implements Subscriber{
    
    @Override
    public void announceBid(String productName, double bid) {
        saveInfoForFutureUse(productName,bid);
    }
    
    private void saveInfoForFutureUse(String pn,double bid){
        System.out.println("That "+pn+" is now worth about "+bid);
    }
}
