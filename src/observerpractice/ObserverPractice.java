package observerpractice;

/**
 *
 * @author dvandenberge
 */
public class ObserverPractice {

    public static void main(String[] args) {
        EbayPublisher ep=new EbayPublisher();
        Buyer buyer1 = new Buyer();
        Seller seller1= new Seller();
        ep.addSubscriber(seller1);
        ep.addSubscriber(buyer1);
        ep.bidOnProduct("Skateboard", 15);
    }
    
}
