
public class Item{

    private String name;
    private final boolean isAlbum;

    private Artist artist;

    public Item(String name,Artist artist,boolean isAlbum){
        this.name=name;
        this.isAlbum=isAlbum;
        this.artist=artist;
    }

    public String getName(){
        return this.name;
    }

    public Artist getArtist(){
        return this.artist;
    }

    public boolean getIsAlbum(){
        return this.isAlbum;
    }

}