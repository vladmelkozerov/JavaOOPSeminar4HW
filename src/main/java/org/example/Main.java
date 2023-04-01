package org.example;



public class Main {
    public static void main(String[] args) {

        VendingMachine <Beverages> beveragesVendingMachine = new VendingMachine<>();
        beveragesVendingMachine.setOrder(new Beverages("Какао",45,70.2,400.0));
        System.out.println(beveragesVendingMachine.getOrder().toString());
        VendingMachine <Snacks> snacksVendingMachine = new VendingMachine<>();
        snacksVendingMachine.setOrder(new Snacks("Пастила",80,60.0,"Маракуйа"));
        System.out.println(snacksVendingMachine.getOrder().toString());
    }
}