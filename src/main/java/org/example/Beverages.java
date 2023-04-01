package org.example;


public class Beverages extends Commodities {
    private double temperature;
    private double volume;


    public Beverages(String name, Integer price) {
        super(name, price);
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "Напиток, доступный в автомате напитков: " +
                " Название=" + name +
                " Объем=" + volume +
                " Температура=" + temperature +
                " Цена=" + price;
    }

    public Beverages(String name, Integer price, double temperature, double volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
