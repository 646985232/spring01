package com.example.spring01.testDesign.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
            Zhu u=new BlackCoffee();
            Tiao t1= new Milk(u);
        System.out.println("order 加入一份牛奶   费用 =" + t1.cost());
        System.out.println("order 加入一份牛奶    描述 = " + t1.getDes());
      /*  Tiao sugar = new Sugar(t1);
        System.out.println("order 加入一份牛奶 加入一份糖 费用 =" + sugar.cost());
        System.out.println("order 加入一份牛奶 加入一份糖 描述 = " + sugar.getDes());*/
    }
}
