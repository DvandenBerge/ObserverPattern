package observerpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dvandenberge
 */
public class EbayPublisher {
    private List<Subscriber> subscribers;
    
    public EbayPublisher(){
        subscribers=new ArrayList();
    }
    
    public void addSubscriber(Subscriber s){
        subscribers.add(s);
    }
    
    public void bidOnProduct(String pn,double bid){
        notifySubscribers(pn,bid);
    }
    
    private void notifySubscribers(String pn,double bid){
        for(Subscriber s:subscribers){
            s.announceBid(pn, bid);
        }
    }
}
