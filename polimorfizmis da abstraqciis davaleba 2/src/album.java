import java.util.List;

public class album {
    String name;
    int releaseYear;
    List<music> musics;

    public album(String name, int releaseYear, List<music> musics) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.musics = musics;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<music> getMusics() {
        return musics;
    }

    public void addMusic(music music){
        musics.add(music);
    }
    public void removeMusic(music music){
        musics.remove(music);
    }
    public void displayInfo(){
        System.out.println("album: " + name + "(" + releaseYear + ")");
        for (music music : musics){
            music.displayInfo();
        }
    }
}
