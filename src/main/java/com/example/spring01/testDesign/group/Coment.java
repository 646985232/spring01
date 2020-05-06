package com.example.spring01.testDesign.group;

public abstract class Coment {
        private  String name;
        private  String des;

    public Coment(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    protected void add(Coment coment){
        throw new UnsupportedOperationException();
    };
    protected   void remove(Coment coment){
        throw new UnsupportedOperationException();
    };
    protected  abstract void print();
}
