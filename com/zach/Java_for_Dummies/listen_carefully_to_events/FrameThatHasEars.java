import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameThatHasEars extends JFrame implements ActionListener {

private final static long UIDserialVersion = 1L; 

JTextField textField = new JTextField(5);

JButton setLabelButton = new JButton("set label");

JLabel label = new JLabel("default");

public FrameThatHasEars(){

setLayout(new FlowLayout());
setDefaultCloseOperation(3);

add(textField);
add(setLabelButton);
add(label);
setLabelButton.addActionListener(this);
pack();
setVisible(true);



}





@Override
public void actionPerformed(ActionEvent e){
 
  String text = textField.getText();

if(text!="" && text!=null){

  label.setText(text);

}else{
 
System.err.println(" no input");

}


}

}