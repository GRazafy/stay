package Application;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ChatWindow extends Stage{

    private Scene scene;
    private int GLOBALWIDTH = 400;
    private int GLOBALHEIGHT = 500;

    private Pane principalPane;
    private Label labelFriend;
    private Label labelAnswer1;
    private Label labelAnswer2;
    private Label labelAnswer3;

    private Separator sep;

    private VBox groupAnswers;
    private VBox groupConv;

    public ChatWindow(){
        principalPane = new Pane();
        groupAnswers = new VBox();
        groupConv = new VBox();

        labelFriend = new Label("Reponse du poto torché");
        labelAnswer1 = new Label("Premiere réponse lol");
        labelAnswer2 = new Label("Deuxième réponse mdr");
        labelAnswer3 = new Label("Troisieme réponse xPtdrrrr");


        labelAnswer1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("ANSWER 1");
            }
        });

        labelAnswer2.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("ANSWER 2");
            }
        });

        labelAnswer3.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("ANSWER 3");
            }
        });

        groupConv.getChildren().addAll(labelFriend);
        groupConv.setMinHeight(380);
        labelFriend.setLayoutY(200);

        sep = new Separator();
        sep.setMinWidth(400);
        sep.setScaleY(10);
        sep.setLayoutY(400);

        groupAnswers.getChildren().addAll(labelAnswer1, labelAnswer2, labelAnswer3);
        groupAnswers.setLayoutY(420);

        principalPane.getChildren().addAll(sep, groupAnswers, groupConv);
        scene = new Scene(principalPane,GLOBALWIDTH,GLOBALHEIGHT);
        scene.getStylesheets().add("src/application/view.css");

        setScene(scene);
        show();
    }

    public void update(){
        groupAnswers.getChildren().clear();
        for (String elem in reponses.getTabReponsesBot()){
            groupAnswers.getChildren().add(new Label(elem));
        }
    }
}
