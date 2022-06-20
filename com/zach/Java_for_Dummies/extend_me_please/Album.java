
import java.util.List;
import java.util.ArrayList;

public class Album extends Item {
    
    
private List<Song> album = new ArrayList<>();

public Album(String name,Artist artist,boolean isAlbum){
    super(name,artist,isAlbum);
}

public void addSong(Song song){
    this.album.add(song);
}

public List<Song> getAlbum(){
    return this.album;
} 


}