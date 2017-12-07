package Application;

import javafx.stage.Stage;

public class Application extends javafx.application.Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        ChatWindow chat = new ChatWindow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
