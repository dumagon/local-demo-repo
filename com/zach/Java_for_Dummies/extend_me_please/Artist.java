
import java.util.List;
import java.util.ArrayList;

public class Artist{

    private String name;
    private List<Item> items=new ArrayList<>();

    public Artist(String name){
        this.name=name;
    }

    public void addItem(Item item){

        items.add(item);


    }

    public List<Item> getItems(){
        return items;
    }

}