//package N1;
//
//import javafx.fxml.FXML;
//import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.TextField;
//import javafx.scene.control.ToggleGroup;
//
//public class controller {
//    @FXML
//    private RadioButton Cat;
//    @FXML
//    private RadioButton Dog;
//    @FXML
//    private RadioButton Bunny;
//    @FXML
//    private RadioButton Bird;
//    @FXML
//    private TextField name;
//    @FXML
//    private ToggleGroup group;
//    @FXML
//    private Label label;
//
//    @FXML
//    private void buttonClick(){
//        RadioButton selected  =  group.getSelectedToggle();
//        if(selected == null || name.getText().isEmpty()){
//            label.setText("enter pet");
//            return;
//        }
//        String pet = selected.getText();
//        label.setText("you chose " + pet);
//    }
//
//}
