package com.example.spring01.testDesign.decorator;

public class Coffee extends Zhu {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
