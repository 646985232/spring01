package com.example.spring01.testDesign.decorator;

public class Milk extends Tiao {
    public Milk(Zhu z) {
        super(z);
        setDesT("牛奶");
        setPriceT(2f);
    }
}
