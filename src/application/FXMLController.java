package application;

import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class FXMLController implements Initializable {
    private int count = 0;
    private int num = 0;

    @FXML
    Button myButton;

    @FXML
    Label myLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        myButton.setText("Count");
        myButton.setOnAction(event);
        myLabel.setText("0");
    }

    EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            if (num < 20) {
                num = count;
                num++;
                myLabel.setText("" + num);
                update(num);
            } else {
                myLabel.setText("You've exceeded\n your limit");
            }


        }

        public void update(int n) {
            count = n;
        }
    };


}
