package org.example;

public class Snacks extends Commodities{

    public Snacks(String name, Integer price) {
        super(name, price);
    }
    private Double weight;
    private String flavour;

    @Override
    public String toString() {
        return "Вкусняшка, доступная в автомате снэков:" +
                " Название=" + name +
                " Вес=" + weight +
                " Вкус=" + flavour +
                " Цена=" + price;
    }

    public Snacks(String name, Integer price, Double weight, String flavour) {
        super(name, price);
        this.weight = weight;
        this.flavour = flavour;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
