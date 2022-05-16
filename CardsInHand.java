

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.util.Random;
//import javax.swing.JFrame.EXIT_ON_CLOSE;



public class CardsInHand {
public static void main(String[] args){

Random random = new Random();

CardDeck hand;

JFrame cards = new JFrame();

cards.setTitle("hand");
cards.setSize(600,600);
cards.setLayout(new GridLayout(6,2,202,30));

for(int i=1;i<=6;i++){

hand =new CardDeck(getRandomSuit(),random.nextInt(13)+1);

cards.add(new JLabel(hand.getSuitName()));
cards.add(new JLabel(""+hand.getNumber()));

}

cards.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

cards.pack();
cards.setVisible(true);


}


static Suits getRandomSuit(){

    Random random = new Random();

int temp = random.nextInt(4)+1; 
switch(temp){

    case 1:
    return Suits.DIAMONDS;
    
    case 2: 
    return Suits.CLUBS;
    
    case 3:
    return Suits.HEARTS;
   
    case 4: 
    return Suits.SPADES;
    default:
    return null;
}

}


}