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

    private int currentLine = 0;
    private int numberLineConv=-1;

    private Pane principalPane;
    private Label labelAnswer1;
    private Label labelAnswer2;
    private Label labelAnswer3;

    private String currentReponse;

    private Separator sep;

    private Reponses reponses;

    private VBox groupAnswers;
    private VBox groupConv;

    public ChatWindow(){
        reponses = new Reponses();
        principalPane = new Pane();
        groupAnswers = new VBox();
        groupConv = new VBox();

        labelAnswer1 = new Label(reponses.getTabReponsesUtil()[0][1]);
        labelAnswer2 = new Label(reponses.getTabReponsesUtil()[0][2]);
        labelAnswer3 = new Label(reponses.getTabReponsesUtil()[0][1]);


        labelAnswer1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                currentReponse = labelAnswer1.getText();
                System.out.println("lklklkl");
                update();
            }
        });

        labelAnswer2.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //currentReponse = reponses.getTabReponsesUtil()[currentLine][1];
                currentReponse = labelAnswer2.getText();
                update();
            }
        });

        labelAnswer3.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //currentReponse = reponses.getTabReponsesUtil()[currentLine][2];
                currentReponse = labelAnswer3.getText();
                update();
            }
        });

        groupConv.getChildren().addAll(new Label(reponses.getTabReponsesBot()[0][1]));

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

        currentLine++;

        Label l = new Label(currentReponse);
        l.setLayoutX(200);
        groupConv.getChildren().add(l);
        groupConv.getChildren().add(new Label(reponses.getTabReponsesBot()[currentLine][1]));

        if(currentLine <= 4) {
            labelAnswer1.setText(reponses.getTabReponsesUtil()[currentLine][0]);
            labelAnswer2.setText(reponses.getTabReponsesUtil()[currentLine][1]);
            labelAnswer3.setText(reponses.getTabReponsesUtil()[currentLine][2]);
        }
    }
}
