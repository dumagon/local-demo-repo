
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameThatKnowsKeyStrokes extends JFrame  implements ActionListener ,KeyListener {

private final static long UIDserialVersion = 1L; 

JTextField textField = new JTextField(5);

JButton setLabelButton = new JButton("set label");

JLabel label = new JLabel("default");

FlowLayout layout = new FlowLayout();

public FrameThatKnowsKeyStrokes(){


setLayout(layout);
setDefaultCloseOperation(3);


add(textField);
add(setLabelButton);
add(label);
setLabelButton.addActionListener(this);
textField.addKeyListener(this);
pack();
setVisible(true);



}


 @Override
   public void actionPerformed(ActionEvent e){
 
    String text = textField.getText();

     if(text!="" && text!=null){

      label.setText(text);
      //textField.setText("");

   }else{
 
  System.err.println(" no input");
       }
     }

@Override
   public void keyPressed(KeyEvent k){}
   @Override
   public void keyTyped(KeyEvent k){}
   @Override
   public void keyReleased(KeyEvent k){

     String text = textField.getText();

   if(text!="" && text!=null){

     label.setText(text);
  
       }else{
 
          System.err.println(" no input");

      }
    }










}