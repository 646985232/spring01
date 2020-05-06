package com.example.spring01.testDesign.group;

public class Client {
    public static void main(String[] args) {
        Coment d = new School("北大", "中国顶级学府");
        Coment x1 = new College("信息系", "IT专业");
        Coment x2 = new College("旅游系", "游玩的专业");
        Coment k1 = new Department("软件编程", "软件编程");
        Coment k2 = new Department("酒店管理", "酒店管理");
        Coment k3 = new Department("移动端编程", "移动端编程");
        Coment k4 = new Department("导游带队", "导游带队");
        x1.add(k1);
        x1.add(k2);
        x2.add(k3);
        x2.add(k4);
        d.add(x1);
        d.add(x2);
        d.print();
    }
}
