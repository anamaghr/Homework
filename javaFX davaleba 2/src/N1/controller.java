package N1;

import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class controller {
@FXML

private Circle circle;
private double x;
private double y;

    public controller(Circle circle) {
        this.circle = circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void Up(javafx.event.ActionEvent actionEvent) {
        circle.setCenterY(y -= 5);
    }
    public void Down(javafx.event.ActionEvent actionEvent) {
        circle.setCenterY(y += 5);
    }
    public void Right(javafx.event.ActionEvent actionEvent) {
        circle.setCenterX( x += 5);
    }
    public void Left(javafx.event.ActionEvent actionEvent) {
        circle.setCenterX(x -= 5);
    }

    public void UpRight (javafx.event.ActionEvent actionEvent) {
        circle.setCenterY(y -= 5);
        circle.setCenterX(x += 5);


    }
    public void UpLeft (javafx.event.ActionEvent actionEvent) {
        circle.setCenterY(y -= 5);
        circle.setCenterX(x -= 5);
    }
    public void DownLeft(javafx.event.ActionEvent actionEvent) {
        circle.setCenterY(y += 5);
        circle.setCenterX(x -= 5);
    }
    public void DownRight (javafx.event.ActionEvent actionEvent) {
        circle.setCenterY(y += 5);
        circle.setCenterX(x += 5);
    }
    public void button(javafx.event.ActionEvent actionEvent){
        circle.setFill(Color.RED);
    }
}
