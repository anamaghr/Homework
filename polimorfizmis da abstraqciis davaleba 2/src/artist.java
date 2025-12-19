import java.util.List;

public class artist {
    String name;
    List<album> albums;
    List<music> musicList;

    public artist(String name, List<album> albums, List<music> musicList) {
        this.name = name;
        this.albums = albums;
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public List<album> getAlbums() {
        return albums;
    }

    public List<music> getMusicList() {
        return musicList;
    }

    public void addAlbum(album album)
    {
        albums.add(album);
        for (music music : album.getMusics()){
            musicList.add(music);
        }
    }
    public void removeAlbum(album album)
    {
        albums.remove(album);
        for (music music : album.getMusics()){
            musicList.remove(music);
        }
    }

    public void displayInfo(){
        System.out.println("artist: " + name);
        System.out.println("albums: ");
        for (album album : albums){
            album.displayInfo();
        }
    }
}
