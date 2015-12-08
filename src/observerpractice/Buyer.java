/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpractice;

/**
 *
 * @author dvandenberge
 */
public class Buyer implements Subscriber{

    @Override
    public void announceBid(String productName, double bid) {
        if(bid>10){
            System.out.println(productName+" is not worth "+bid);
        }else{
            System.out.println("That "+productName+" is cheap! It's going for "+bid);
        }
    }
}
