/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author vineet
 */
public class CardTester {
    public static void main(String[] args)
    {
       
       CardGame c1 =new CardGame("Clubs",6);
        c1.setSuit("Hearts");
        System.out.println ("New suit is "+ c1.getSuit());
        
    }
}