package observerpractice;

/**
 *
 * @author dvandenberge
 */
public interface Subscriber {
    public abstract void announceBid(String productName, double bid);
}
