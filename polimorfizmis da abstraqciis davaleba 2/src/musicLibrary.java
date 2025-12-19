import java.util.List;

public class musicLibrary {
    List<artist> artists;
    List<album> albums;
    List<music> songs;

    public musicLibrary(List<artist> artists, List<album> albums, List<music> songs) {
        this.artists = artists;
        this.albums = albums;
        this.songs = songs;
    }

    public List<artist> getArtists() {
        return artists;
    }

    public List<album> getAlbums() {
        return albums;
    }

    public List<music> getSongs() {
        return songs;
    }

    public  void addArtist(artist artist){
        artists.add(artist);

        for (album album : artist.getAlbums()){
            artist.addAlbum(album);
        }

        for (music music : artist.getMusicList()){
            songs.add(music);
        }
    }

    public  void removeArtist(artist artist){
        artists.remove(artist);

        for (album album : artist.getAlbums()){
            artist.removeAlbum(album);
        }

        for (music music : artist.getMusicList()){
            songs.remove(music);
        }
    }
}
