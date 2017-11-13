package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;




public class Controller {

    public TextField textfield;
    public TableView<String> table;


    public void click(ActionEvent actionEvent) {

        table.getItems().add(textfield.getText());

    }

    public void initialize() {
        TableColumn<String, String> wyraz = (TableColumn<String, String>) table.getColumns().get(0);
        if (wyraz.getCellValueFactory() == null) {
            wyraz.setCellValueFactory((param -> new SimpleStringProperty(param.getValue())));


        }

    }
}


