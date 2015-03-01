package org.diosoft.spring;

public class TestBean {

    private String age;
    private TestBean spouse;

    public void setAge(String age) {this.age = age;}

    public String getAge() { return age; }

    public void setSpouse(TestBean spouse) {this.spouse = spouse;}

    public TestBean getSpouse() { return spouse; }
}
