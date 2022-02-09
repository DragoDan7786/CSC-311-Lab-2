package com.mycompany.csc_311_lab2;

import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private ListView<String> listViewShows;

    public void initialize(){
        ObservableList<String> theItems = listViewShows.getItems();
        theItems.add("What We Do in the Shadows");
        theItems.add("Superstore");
    }
    
    @FXML
    private TextField showName;
    
    
    @FXML
    private void nameButtonPressed(){
        ObservableList<String> theItems = listViewShows.getItems();
        String theName = showName.getText();
        theItems.add(theName);  
        showName.clear();
    }
    
    @FXML
    private void listClear(){
        ObservableList<String> theItems = listViewShows.getItems();
        theItems.clear();
    }
}
