package com.example.less_4_2;

import java.io.Serializable;

public class User implements Serializable {

    // поля сущности
    private String name;
    private String departure_point;
    private String place_arrival;

    // необходимый конструктор
    public User(String name, String address, String email) {
        this.name = name;
        this.departure_point = departure_point;
        this.place_arrival = place_arrival;
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getdeparture_point() {
        return departure_point;
    }

    public void setdeparture_point(String address) {
        this.departure_point = departure_point;
    }

    public String getplace_arrival() {
        return place_arrival;
    }

    public void setplace_arrival(String email) {
        this.place_arrival = place_arrival;
    }
}