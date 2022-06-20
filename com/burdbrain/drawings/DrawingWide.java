
package com.burdbrain.drawings;

import java.awt.Graphics;


public class DrawingWide extends Drawing {


int width = 100, height = 60;

public void paint(Graphics g){

    g.drawOval(x,y,100,60);
}




}