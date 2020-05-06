package com.example.spring01.testDesign.decorator;

public  class Tiao{
    public String desT; // 描述
    private float priceT = 0.0f;

    public String getDesT() {
        return desT;
    }

    public void setDesT(String desT) {
        this.desT = desT;
    }

    public float getPriceT() {
        return priceT;
    }

    public void setPriceT(float priceT) {
        this.priceT = priceT;
    }

    private Zhu z;

    public Tiao(Zhu z) {
        this.z = z;
    }



    public float cost() {
        return getPriceT()+z.getPrice();
    }

    public String getDes() {
        // TODO Auto-generated method stub
        // obj.getDes() 输出被装饰者的信息
        return desT + " "  + " && " + z.getDes();
    }
}
