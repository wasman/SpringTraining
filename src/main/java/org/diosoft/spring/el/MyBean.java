package org.diosoft.spring.el;

public class MyBean {
    private final String value1;
    private final String value2;
    private  double value3;

    public MyBean(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
        System.out.println("value1 " +this.value1);
        System.out.println("value2 " +this.value2);
    }

    public double getValue3() {
        return value3;
    }

    public void setValue3(double value3) {
        this.value3 = value3;
    }

    public void init(){
        System.out.println("value3 " +this.value2);
    }
}
