package com.example.trainfront;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FlyingAddController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button addButtonFlights;

    @FXML
    private Button addButtonTrains;

    @FXML
    private Button addButtonAddTrain;

    @FXML
    private TextField addArrDate;

    @FXML
    private TextField addArrTime;

    @FXML
    private TextField addDepDate;

    @FXML
    private TextField addDepTime;

    @FXML
    private TextField addFrom;

    @FXML
    private Button addSave;

    @FXML
    private TextField addBasicPrice;

    @FXML
    private TextField addWhere;

    @FXML
    private ComboBox<Trains> addTrain;

    private final HttpClientUtil httpClientUtil = new HttpClientUtil();

    private ObservableList<Trains> myComboBoxData = FXCollections.observableArrayList();

    @FXML
    void initialize() throws Exception {
        List<Trains> trains = httpClientUtil.getTrainsList();
        myComboBoxData.addAll(trains);
        addTrain.setItems(myComboBoxData);
        addSave.setOnAction(x -> {
            String cityFrom = addFrom.getText();
            String cityWhere = addWhere.getText();
            String departureDate = addDepDate.getText();
            String departureTime = addDepTime.getText();
            String arrivalDate = addArrDate.getText();
            String arrivalTime = addArrTime.getText();
            String basePrice = addBasicPrice.getText();
            Trains train = addTrain.getValue();
            try {
                httpClientUtil.sendPostFlight(cityFrom,cityWhere,departureDate,arrivalDate,departureTime,arrivalTime,basePrice,train.getName());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        addButtonTrains.setOnAction(x ->{
            try {
                Util.openPage("trains.fxml",addButtonTrains);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        addButtonAddTrain.setOnAction(x ->{
            try {
                Util.openPage("addTrain.fxml",addButtonAddTrain);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        addButtonFlights.setOnAction(x ->{
            try {
                Util.openPage("hello-view.fxml", addButtonFlights);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }
}




