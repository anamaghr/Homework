//package N1;
//
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Button;
//import javafx.scene.control.ButtonType;
//
//import java.util.Optional;
//
//public class button {
//    @FXML
//   private Button mainButton;
//   private int totalClicks;
//   @FXML
//   private void bt(){
//       mainButton.setOnAction(e -> click());
//
//   }
//   private void click(){
//       totalClicks++;
//       if(totalClicks == 5){
//           Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//           alert.setTitle("exit");
//           alert.setHeaderText("do you want to exit the app?");
//           alert.setContentText("choose your options:");
//           Optional<ButtonType> btn = alert.showAndWait();
//
//           if(btn.isPresent() && btn.get() == ButtonType.OK){
//               System.exit(0);
//           }
//           else{
//               totalClicks = 0;
//           }
//       }
//   }
//
//}
