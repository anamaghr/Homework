import java.util.Objects;

public class reindeer  extends  workshopMember{
    String name;
    int age;
    double flyingSpeed;
    String noseColor;

    public reindeer(String name1, int age1, double flyingSpeed,String noseColor) {
        super(name, nickName, age);
        this.name = name1;
        this.age = age1;
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }



    public void fly(){
        System.out.println(name + " if flying");
    }
    public void trainForChristmas(){
        System.out.println(name + " is training for christmas");
    }

    private double averageSpeed(){
        return 60;
    }
    private int averageAge() {
        return 7;

    }

     public char checkFitnessLevel(){
       boolean fast = flyingSpeed > averageSpeed();
       boolean young = age < averageAge();

       if(fast && young) return 'A';
       if(fast) return 'B';
       if(young) return 'C';
       if(age == averageAge() && flyingSpeed == averageSpeed()) return 'D';
       return 'F';
     }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public double getFlyingSpeed() {
        return flyingSpeed;
    }

    public String getNoseColor() {
        return noseColor;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void setFlyingSpeed(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    public void setNoseColor(String noseColor) {
        this.noseColor = noseColor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        reindeer reindeer = (reindeer) o;
        return age == reindeer.age && Double.compare(flyingSpeed, reindeer.flyingSpeed) == 0 && Objects.equals(name, reindeer.name) && Objects.equals(noseColor, reindeer.noseColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, age, flyingSpeed, noseColor);
    }

    @Override
    public String toString() {
        return "reindeer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", flyingSpeed=" + flyingSpeed +
                ", noseColor='" + noseColor + '\'' +
                '}';
    }
}
