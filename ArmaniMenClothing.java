import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArmaniMenClothing{
    static final String designer = "Armani";
    ClothingType type;
    String modelName;

    public ArmaniMenClothing(){}

    public ArmaniMenClothing(ClothingType type,String modelName){
        this.type=type;
        this.modelName=modelName;
    }


    public void displaySet(JFrame frame){
        
        frame.add(new JLabel(this.modelName));
        frame.add(new JLabel("("+this.type.name()+")"));
        
    }

}