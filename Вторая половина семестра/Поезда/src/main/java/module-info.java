module com.example.trainfront {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires json;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires com.fasterxml.jackson.databind;
    requires java.sql;


    opens com.example.trainfront to javafx.fxml;
    exports com.example.trainfront;
}