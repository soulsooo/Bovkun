package com.example.trainrest.models;

import jakarta.persistence.Entity; import jakarta.persistence.GeneratedValue; import jakarta.persistence.GenerationType; import jakarta.persistence.Id; import jakarta.persistence.EnumType; import jakarta.persistence.Enumerated; import jakarta.persistence.OneToMany; import java.util.List;

@Entity public class Train { @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private TrainType trainType;

    @OneToMany
    private List<Transportation> carriages;

    public Train() {}

    public Train(Long id, String name, TrainType trainType, List<Transportation> carriages) {
        this.id = id;
        this.name = name;
        this.trainType = trainType;
        this.carriages = carriages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public List<Transportation> getCarriages() {
        return carriages;
    }

    public void setCarriages(List<Transportation> carriages) {
        this.carriages = carriages;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", trainType=" + trainType +
                ", carriages=" + carriages +
                '}';
    }
}




