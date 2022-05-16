
package com.zach.Java_for_Dummies.GUI_examples;

 
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;





@SuppressWarnings("serial")
public class SimpleFrame extends JFrame {

    public SimpleFrame(){

        setTitle("don't push this button!");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);  // tells java to exit the app , for example if you set DO_NOTHING_ON_CLOSE
                                                 // the window will disappear after clicking on 'x' but the app continues running  
        add(new JButton("panic"));
        setSize(500,100);
        setVisible(true);
        
    }



}