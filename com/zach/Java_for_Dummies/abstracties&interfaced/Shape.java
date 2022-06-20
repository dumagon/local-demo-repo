import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public abstract class Shape extends JFrame {
int size ;
Color color ;
boolean isFilled;
public abstract void paint(Graphics g); 
}