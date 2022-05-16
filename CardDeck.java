


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;


public class CardDeck {

private Suits suit;
private int number;

public CardDeck(Suits suit, int number){

this.suit=suit;
this.number=number;

}


public String getSuitName(){
    return suit.name();
    
}
public int getNumber(){
    return number;

}


}