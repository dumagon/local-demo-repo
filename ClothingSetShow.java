import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;


public class ClothingSetShow{

public static void main(String[] args){

ArmaniMenClothing item = new ArmaniMenClothing();

JFrame frame =new JFrame();
frame.setLayout(new GridLayout(2,10,2,2));

for(int i = 1;i<=5;i++){
    frame.add(new JLabel(item.designer));
    frame.add(new JLabel("****"));
}



ArmaniMenClothing itemToShow =new ArmaniMenClothing(ClothingType.SHOES,"classic(black)#3");
itemToShow.displaySet(frame);

itemToShow =new ArmaniMenClothing(ClothingType.SHIRT,"'minister' (white)#5");
itemToShow.displaySet(frame);

itemToShow =new ArmaniMenClothing(ClothingType.PANTS,"cropped 'everyday style' (grey)#6");
itemToShow.displaySet(frame);

itemToShow =new ArmaniMenClothing(ClothingType.JACKET,"'ombudsman' (grey)#3");
itemToShow.displaySet(frame);

itemToShow =new ArmaniMenClothing(ClothingType.TIE,"'Moscow'(red)#3");
itemToShow.displaySet(frame);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
frame.setVisible(true);

}

}