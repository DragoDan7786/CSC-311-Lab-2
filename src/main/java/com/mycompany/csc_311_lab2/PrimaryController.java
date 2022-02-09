package com.mycompany.csc_311_lab2;

import java.io.IOException;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    @FXML
    private ListView<String> listViewShows;
    
    @FXML
    private ObservableList<String> theItems;

    public void initialize(){
        theItems = listViewShows.getItems();
        theItems.add("What We Do in the Shadows");
        theItems.add("Superstore");
    }
    
    @FXML
    private TextField showName;
    
    
    @FXML
    private void nameButtonPressed(){
        theItems = listViewShows.getItems();
        String theName = showName.getText();
        theItems.add(theName);  
        showName.clear();
    }
    
    @FXML
    private void listClear(){
        theItems = listViewShows.getItems();
        theItems.clear();
    }
    
    @FXML
    protected void listItemClicked(MouseEvent event){
        theItems = listViewShows.getItems();
        int listIndex = listViewShows.getSelectionModel().getSelectedIndex();
        if(listIndex >= 0 && listIndex < theItems.size())
            System.out.println("Selected item: " + theItems.get(listIndex));
    }
}
