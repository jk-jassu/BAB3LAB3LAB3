module com.example.hrmanagementjasbirkaur {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hrmanagementjasbirkaur to javafx.fxml;
    exports com.example.hrmanagementjasbirkaur;
}