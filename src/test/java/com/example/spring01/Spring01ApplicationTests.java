package com.example.spring01;

import ch.qos.logback.core.net.SyslogOutputStream;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.applet.Main;

import java.io.*;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring01ApplicationTests {

    @Test
    public void ObjectStream(){
      String str1="a";
      String str2="b";
      String str3="a"+"b";
      String str4=str1+str2;
        System.out.println(str4==str3);
        char a='a';
        char b='b';
        int c=a;
        System.out.println(a-b);
        System.out.println(c);
        int i1=1;
        int i2=1;
        int i3=i1+i2;
        System.out.println(i3);
    }

    public static void main(String[] args) {
        BufferedReader br=null;
        try {
        InputStream in = System.in;
        InputStreamReader ir=new InputStreamReader(in);
        br=new BufferedReader(ir);
       /* int len;
        char[] a=new char[10];
        while ((len=ir.read())!=-1){
            int read = ir.read(a, 0, len);
        }*/
        while (true){
            System.out.println("请输入英文字母：");
            String s = null;
            s = br.readLine();
            Executors.newFixedThreadPool(5);
            String s1 = s.toUpperCase();
            if(s1.equals("E")){
                in.close();
                break;
            }
           System.out.println(s1);
       }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void contextssLoads() {
        Demo d=new Demo();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0;i<10;i++)
        executorService.submit(d);
        executorService.shutdown();

    }
   @Test
    public void testPersion(){
        Persion p1=new Persion(12,"aa");
        Persion p2=new Persion(12,"aa");
        Persion.Son son=p1.new Son();
        son.setName("son");
        log.info("son--"+son.getName());
       Result1 re = p2.re();
       String say = re.say();
       System.out.println(say);
       Object a=new Object();
        System.out.println( p1.equals(p2));
       System.out.println( p1.hashCode());
       System.out.println( p2.hashCode());

   }

}
class  Persion{
    private Integer age;
    private String name;
    class Son{
        String name;
        String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }
    public Result1 re(){
        return new Result1() {
            @Override
            public String say() {
                return "你好";
            }
        };
    }
    public Persion(Integer age) {
        super();
    }

    public Persion(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persion)) return false;
        Persion persion = (Persion) o;
        return Objects.equals(age, persion.age) &&
                Objects.equals(name, persion.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(age, name);
    }*/
}
class Demo implements  Runnable{
    private int i=0;



    @Override
    public void run() {
        System.out.println(i);
        while (i<100){
            System.out.println(Thread.currentThread().getName()+":"+i++);
        }
    }
}
interface Result1{
    public String say();
}