package com.example.uebunggit;

public class Tracking {

    double longitude;
    double latitude;
    String date;
    String time;

    public Tracking() {

    }

    public Tracking(double longitude, double latitude, String date, String time) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.date = date;
        this.time = time;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Tracking{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
