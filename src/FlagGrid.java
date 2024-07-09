import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FlagGrid extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        // Load images from files
        Image chinaFlag = new Image("file:flag1.gif");
        Image usaFlag = new Image("file:flag2.gif");
        Image ukFlag = new Image("file:flag6.gif");
        Image franceFlag = new Image("file:flag7.gif");

        // Create ImageView nodes
        ImageView chinaFlagView = new ImageView(chinaFlag);
        ImageView usaFlagView = new ImageView(usaFlag);
        ImageView ukFlagView = new ImageView(ukFlag);
        ImageView franceFlagView = new ImageView(franceFlag);

        // Add ImageView nodes to GridPane
        gridPane.add(chinaFlagView, 0, 0);
        gridPane.add(usaFlagView, 1, 0);
        gridPane.add(ukFlagView, 0, 1);
        gridPane.add(franceFlagView, 1, 1);

        // Create a Scene and display the GridPane
        Scene scene = new Scene(gridPane, 800, 600);
        primaryStage.setTitle("Flag Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
