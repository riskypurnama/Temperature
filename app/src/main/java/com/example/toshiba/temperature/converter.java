package com.example.toshiba.temperature;

public class converter {
    private double temp = 0;

    public converter() {
    }

    public converter(double temp) {
        this.temp = temp;
    }

    public void setTemperature(double temp) {
        this.temp = temp;
    }

    public double getCelcius() {
        return temp;
    }

    public double getFarenheit() {
        temp = (getCelcius() * 1.8) +32.0;
        return temp;
    }

    public double getKelvin() {
        temp = (getCelcius() + 273.15);
        return temp;
    }
}


