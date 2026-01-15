import java.util.List;
import java.util.Objects;

public class child {
    String name;
    int behaviorScore;
    private List<String> wishlist;

    public child(String name, int behaviorScore) {
        this.name = name;
        this.behaviorScore = behaviorScore;
        this.wishlist = wishlist;
    }



    public void addWish(String wish){
           wishlist.add(wish);
    }

    public int getBehaviorScore() {
        return behaviorScore;
    }

    public String getName() {
        return name;
    }

    public List<String> getWishlist() {
        return wishlist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBehaviorScore(int behaviorScore) {
        this.behaviorScore = behaviorScore;
    }

    public void setWishlist(List<String> wishlist) {
        this.wishlist = wishlist;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        child child = (child) o;
        return behaviorScore == child.behaviorScore && Objects.equals(name, child.name) && Objects.equals(wishlist, child.wishlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, behaviorScore, wishlist);
    }

    @Override
    public String toString() {
        return "child{" +
                "name='" + name + '\'' +
                ", behaviorScore=" + behaviorScore +
                ", wishlist=" + wishlist +
                '}';
    }
}
