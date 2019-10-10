package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private double price;
    List<Nachinka> nachinka = new ArrayList<>();

    public Pizza() {
        this.price = 5;
    }

    public void addNachinka(Nachinka nachinka) {
        this.nachinka.add(nachinka);
        calculatePrice();
    }

    public void calculatePrice() {
        for(Nachinka nachinka: nachinka) {
            this.price += nachinka.getPrice();
        }
    }

    public double getPrice() {
        return price;
    }
}
