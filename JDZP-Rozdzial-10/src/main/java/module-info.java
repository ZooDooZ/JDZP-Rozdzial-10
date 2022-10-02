module com.example.jdzprozdzial10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens Exercise1 to javafx.fxml;
    exports Exercise1;
}