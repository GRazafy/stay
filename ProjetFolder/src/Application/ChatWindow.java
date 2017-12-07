package Application;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ChatWindow extends Stage{

    private Scene scene;
    private int GLOBALWIDTH = 300;
    private int GLOBALHEIGHT = 500;

    private GridPane grid;

    public ChatWindow(){
        grid = new GridPane();

        scene = new Scene(grid,GLOBALWIDTH,GLOBALHEIGHT);
        scene.getStylesheets().add("src/application/view.css");
        System.out.println("ffff");
        setScene(scene);
        show();
    }
}
