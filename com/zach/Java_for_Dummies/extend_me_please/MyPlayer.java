

public class MyPlayer{

    public static void main(String[] args){

     Artist tricky = new Artist("Tricky");   

     Album lonelyGuest = new Album("Lonely Guest",tricky,true);

     Song preWarTension = new Song("pre war tension",tricky,Genre.TRIP_HOP,false);
     Song lonely_guest = new Song("lonely guest ",tricky,Genre.TRIP_HOP,false);
     Song bury_the_evidence = new Song("bury the evidence",tricky,Genre.TRIP_HOP,false);

     lonelyGuest.addSong(lonely_guest);
     lonelyGuest.addSong(preWarTension);

     tricky.addItem(lonelyGuest);
     tricky.addItem(bury_the_evidence);


     Playlist myPlaylist = new Playlist();
     
     
     for(Item item:tricky.getItems()){

         myPlaylist.getPlaylist().add(item);
     }

     for(Item item : myPlaylist.getPlaylist()){

       if(item.getIsAlbum()){
        Album myAlbum =(Album) item;
           for(Item song : myAlbum.getAlbum() ){
            Song mySong = (Song) song;
            System.out.println(mySong.getName()+" "+mySong.getGenre());
           }

       }

     }

    



     





    }

}