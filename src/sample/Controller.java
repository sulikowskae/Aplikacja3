package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.List;



public class Controller {

    public TextField textfield;
    List<String> lista = new ArrayList<String>();


    public void click(ActionEvent actionEvent) {

            lista.add(textfield.getText());
            ObservableList<String> string = FXCollections.observableArrayList(lista);

            TableView tableview = new TableView<>(string);

            //System.out.print(tableview.getItems());

        }

}
