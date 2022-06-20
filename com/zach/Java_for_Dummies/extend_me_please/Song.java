

public class Song extends Item{


private Genre genre ;

public Song(String name,Artist artist,Genre genre,boolean isAlbum){
  
  super(name,artist,isAlbum);
  this.genre=genre;

}

public Genre getGenre(){
    return this.genre;
}



}