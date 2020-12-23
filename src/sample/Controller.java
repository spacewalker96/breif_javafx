package sample;
        import javafx.event.Event;
        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.layout.BorderPane;

public class Controller {
    @FXML
    private Label title;
    @FXML
    private Button btn;
    @FXML
    private BorderPane background;

    @FXML
    public void buttonClicked(Event e){
        String text = "Etre amoureux vous rend fainéant" ;
        //System.out.println(text);
        background.setStyle("-fx-background-color: purple;");
        btn.setStyle("-fx-text-fill: purple");
        title.setText(text);
    }
}
