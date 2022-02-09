module com.mycompany.csc_311_lab2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.csc_311_lab2 to javafx.fxml;
    exports com.mycompany.csc_311_lab2;
}
