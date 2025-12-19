public class music extends playable{
    String title;
    double duration;
    String genre;

    public music(String title, double duration, String genre) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public double getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void displayInfo(){
        System.out.println("title: " + title);
        System.out.println("duration: " + duration);
        System.out.println("genre: " + genre );
    }
    @Override
    public void play() {
        System.out.println("now playing: " + title);
    }
    @Override
    public void stop() {
        System.out.println("stopped playing: " + title);
    }
}
