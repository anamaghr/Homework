import java.util.List;

public class snowman {
    double height;
    String hatColor;
    boolean isMagical;
    List<String> accessories;

    public snowman(double height, String hatColor) {
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = isMagical;
        this.accessories = accessories;
    }

    public void decorate(String accessory){
        accessories.add(accessory);
    }

    public void melt(){
        if(height == 0){
            return;
        }
        if(height < 1){
            height = 0;
        }
        height = height / 2;

    }

    public void makeMagical(){
        isMagical = true;
    }
}
