Package com.example.trainfront;

import java.util.Objects;

public class Flying {
    private Long id;
    private String cityFrom;
    private String cityWhere;
    private String departureDateTime;
    private String arrivalDateTime;
    private int basePrice;
    private int seats;
    private Train train;

    public Flying(Long id, String cityFrom, String cityWhere, String departureDateTime, String arrivalDateTime, int basePrice, int seats, Train train) {
        this.id = id;
        this.cityFrom = cityFrom;
        this.cityWhere = cityWhere;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.basePrice = basePrice;
        this.seats = seats;
        this.train = train;
    }

    public Flying() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityWhere() {
        return cityWhere;
    }

    public void setCityWhere(String cityWhere) {
        this.cityWhere = cityWhere;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return basePrice == flying.basePrice && seats == flying.seats && Objects.equals(id, flying.id) && Objects.equals(cityFrom, flying.cityFrom) && Objects.equals(cityWhere, flying.cityWhere) && Objects.equals(departureDateTime, flying.departureDateTime) && Objects.equals(arrivalDateTime, flying.arrivalDateTime) && Objects.equals(train, flying.train);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cityFrom, cityWhere, departureDateTime, arrivalDateTime, basePrice, seats, train);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityWhere='" + cityWhere + '\'' +
                ", departureDateTime='" + departureDateTime + '\'' +
                ", arrivalDateTime='" + arrivalDateTime + '\'' +
                ", basePrice=" + basePrice +
                ", seats=" + seats +
                ", train=" + train +
                '}';
    }
}