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
public class CardGame 
{
private String suit;
private int value; 
public static final String[] SUITS ={"clubs","hearts","diamonds","spades"};

    CardGame(String clubs, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    public String getSuit() {
        return suit;
    }


    public void setSuit(String suit) {
        this.suit = suit;
    }

  
    public int getValue() {
        return value;
    }

   
    public void setValue(int value) {
        this.value = value;
    }
 
public int ranSuit()
{
    int val= (int)(Math.random()*4)+0;
    return val;
}
public int ranValue()
{
 int vlu= (int)(Math.random()*13)+1;   
 return vlu;
}
}