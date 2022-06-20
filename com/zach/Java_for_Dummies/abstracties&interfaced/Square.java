
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;


public class Square extends Shape{


public Square(int size , Color color , boolean isFilled){

  this.size=size;
  this.color=color;
  this.isFilled=isFilled;
  
  setDefaultCloseOperation(3);
  setSize(this.size*5,this.size*5);
 }
 



  @Override
  public void paint(Graphics g){


    if(isFilled){
      g.setColor(color);
      g.fillRect(size*2,size*2,size,size);
    }else{
      g.drawRect(size,size,size,size);
    }




  }

    

 }

