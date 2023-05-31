package com.example.trainfront;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class AddTrainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private Button addTrainAddFlights;
    @FXML
    private Button addTrainFlights;
    @FXML
    private Button addTrainTrains;
    @FXML
    private TextField addTrainName;

    @FXML
    private TextField addTrainSeats;
    @FXML
    private TextField addTrainCarriage;
    @FXML
    private ComboBox<TrainType> addTrainType;
    private ObservableList<TrainType> myComboBoxData = FXCollections.observableArrayList();
    @FXML
    private Button addTrainSave;
    @FXML
    void initialize() {
        List<TrainType> types = new ArrayList<TrainType>(Arrays.asList(TrainType.values()));
        myComboBoxData.addAll(types);
        addTrainType.setItems(myComboBoxData);
        addTrainSave.setOnAction(x ->{
            String trainName = addTrainName.getText();
            String trainType = addTrainType.getValue()+"";
            String seats = addTrainSeats.getText();
            String carriage = addTrainCarriage.getText();
            try {
                sendPostTrain(trainName,trainType,seats,carriage);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        addTrainTrains.setOnAction(x ->{
            try {
                Util.openPage("trains.fxml",addTrainTrains);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        addTrainFlights.setOnAction(x ->{
            try {
                Util.openPage("hello-view.fxml",addTrainFlights);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        addTrainAddFlights.setOnAction(x ->{
            try {
                Util.openPage("addFlight.fxml", addTrainAddFlights);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

    }

    private void sendPostTrain(String name, String type, String seats, String carriage) throws Exception {

        HttpPost post = new HttpPost("http://localhost:8080/addTrain");

        // add request parameter, form parameters
        List<NameValuePair> urlParameters = new ArrayList<>();
        urlParameters.add(new BasicNameValuePair("name", name));
        urlParameters.add(new BasicNameValuePair("type", type));
        urlParameters.add(new BasicNameValuePair("seats", seats));
        urlParameters.add(new BasicNameValuePair("carriage", carriage));

        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(post)) {
            System.out.println(EntityUtils.toString(response.getEntity()));
        }

    }

}



