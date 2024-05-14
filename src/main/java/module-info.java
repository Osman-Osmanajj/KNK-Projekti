module com.example.knk2024 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.knk2024 to javafx.fxml;
    exports com.example.knk2024;
}