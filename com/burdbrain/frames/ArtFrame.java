package com.burdbrain.frames;

import java.awt.Graphics;
import javax.swing.JFrame;
import com.burdbrain.drawings.Drawing;


public class ArtFrame extends JFrame{

Drawing drawing;

public ArtFrame(Drawing drawing){

this.drawing=drawing;
setTitle("Abstract art");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}


public void paint(Graphics g){
    drawing.paint(g);
}




}