
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;


public class Circle extends Shape {

public Circle(int size,Color color,boolean isFilled){
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
            g.fillOval(size*2,size*2,size,size);
        }else{

          g.drawOval(50,50,size,size);}
    }




    // public  void paint(){

    //     JFrame frame = new JFrame();
    //     frame.setSize(400,400);
    //     frame.setDefaultCloseOperation(3);
    //     paintShape(Graphics g);
    //     if(isFilled){ 
    //     g.setColor(Color.BLUE);
    //     g.fillOval(20,20,size,size);
    //     }else{
    //         g.drawOval(20,20,size,size);
    //     }
        
    //     frame.setVisible(true);

    // }

    // public void paintShape(Graphics g ){
    //     g.drawOval(20,20,size,size);
    // }


}