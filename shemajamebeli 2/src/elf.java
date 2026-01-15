import java.util.Objects;

public class elf extends  workshopMember implements christmasCelebrator{
   int skillLevel;
    String elfType;

    public elf(String name, String nickName, int age, int skillLevel, String elfType) {
        super(name, nickName, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
    }

    public void makeToy(){
        System.out.println(name + "( " + elfType + " ) is making a toy");
        increaseExperience();
        System.out.println("toy is complete and the skill level is now " + skillLevel);
    }

    public void wrapGifts(){
        System.out.println(name + "( " + elfType + " ) is wrapping gifts");
        increaseExperience();
        System.out.println("gift wrapping is complete and the skill level is now " + skillLevel);
    }

    private void increaseExperience(){
         skillLevel++;
    }

    @Override
    public void celebrateChristmas() {
    }

    @Override
    public void hostChristmasParty() {
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public String getElfType() {
        return elfType;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public void setElfType(String elfType) {
        this.elfType = elfType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        elf elf = (elf) o;
        return skillLevel == elf.skillLevel && Objects.equals(elfType, elf.elfType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skillLevel, elfType);
    }

    @Override
    public String toString() {
        return "elf{" +
                "skillLevel=" + skillLevel +
                ", elfType='" + elfType + '\'' +
                '}';
    }
}
