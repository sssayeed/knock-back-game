package knock.back;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static final int HEIGHT = 720;
    public static final int WIDTH = 1280;
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("KnockBack pre-alpha build 1");

        Model model = new Model();
        GameView gameView = new GameView(model);

        StackPane root = new StackPane();
        root.getChildren().add(gameView);

        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
    }
}
