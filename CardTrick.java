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
public class CardTrick {
    public static void main(String[] args) 
    {
      CardGame[] magicHand = new CardGame[7];
      for(int i=0;i<magicHand.length;i++)
      {
      CardGame c1 = new CardGame();
      c1.setValue(c1.ranValue());
      c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
      magicHand[i] =c1;
      }
    for(int i=0;i<magicHand.length;i++)
      {
      System.out.println(magicHand[i].getSuit() +" "+ magicHand[i].getValue());
      
      }

    
    
    }
}