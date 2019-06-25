package Question3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.shape.Polygon;

public class Question3a extends Application {

    public  void start(Stage stage){

        double[] C1 = {10,90, 50,50, 100, 90, 180,0, 220,40, 100,170, 10,90};
        Polygon P1 = new Polygon(C1);

        Group root = new Group(P1);
        Scene scene = new Scene(root, 220, 200);
        stage.setScene(scene);
        stage.show();
    }
}
