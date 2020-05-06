package com.example.spring01.testDesign.group;

import java.util.ArrayList;
import java.util.List;

public  class College extends Coment {
    List<Coment> coments=new ArrayList<>();
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(Coment coment) {
        coments.add(coment);
    }

    @Override
    protected void remove(Coment coment) {
        coments.remove(coment);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public void setDes(String des) {
        super.setDes(des);
    }

    @Override
    protected void print() {
        System.out.println("------------"+getName()+"------------");

        for(Coment coment:coments){
            coment.print();
        }
    }
}
