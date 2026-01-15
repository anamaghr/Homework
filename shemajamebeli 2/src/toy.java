import java.util.Objects;

public class toy {
    String type;
    int difficultyLevel;

    public toy(String type, int difficultyLevel) {
        this.type = type;
        this.difficultyLevel = difficultyLevel;
    }

    public boolean isChallenging(){
       return difficultyLevel > 7;
    }

    @Override
    public String toString() {
        return "toy{" +
                "type='" + type + '\'' +
                ", difficultyLevel=" + difficultyLevel +
                '}';
    }

    public String getType() {
        return type;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        toy toy = (toy) o;
        return difficultyLevel == toy.difficultyLevel && Objects.equals(type, toy.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, difficultyLevel);
    }
}
