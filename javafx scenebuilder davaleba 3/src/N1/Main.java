//package N1;
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
//        Scene scene = new Scene(loader.load(), 300, 300);
//        stage.setTitle("Button app");
//        stage.setScene(scene);
//        stage.setOnCloseRequest(windowEvent -> {
//            windowEvent.consume(); });
//        stage.show();
//    }
//}