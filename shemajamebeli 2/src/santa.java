import java.util.ArrayList;
import java.util.List;
public class santa extends workshopMember implements christmasSpirit{
    private List<child> childrenList;

    public santa(String name, String nickName, int age) {
        super(name, nickName, age);
        this.childrenList = childrenList;
    }
    @Override
    public void spreadJoy() {

    }
    @Override
    public void singCarols() {

    }
    @Override
    public void decorateTree() {

    }

    public void deliverGifts(){
        List<child> niceChildren = checkNaughtyOrNiceList();
        for (child child : niceChildren) {
            System.out.println("deliviring gifts to " + child.getName());
        }
    }

     public List<child> checkNaughtyOrNiceList(){
        List<child> niceChildren = new ArrayList<>();
        for(child child : childrenList){
            if(child.getBehaviorScore() > 5){
                niceChildren.add(child);
            }
        }
        return niceChildren;
     }
}
