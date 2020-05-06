package com.example.spring01.testDesign.decorator;

public class Sugar extends Tiao {
    public Sugar(Zhu z) {
        super(z);
        setDesT("糖");
        setPriceT(6f);
    }
}
