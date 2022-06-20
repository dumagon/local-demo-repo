
package com.zach.mydrawings;

import java.awt.Graphics;
import java.awt.Color;

import com.burdbrain.drawings.Drawing;

public class DrawingColor extends Drawing {

    int width = 40, height =20;

    @Override
    public void paint(Graphics g){

     g.setColor(Color.GREEN);
     g.fillOval(x,y,width,height);

    }

}