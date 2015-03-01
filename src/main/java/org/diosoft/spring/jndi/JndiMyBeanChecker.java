package org.diosoft.spring.jndi;

public class JndiMyBeanChecker {

    private final MyBean myBean;

    public JndiMyBeanChecker(MyBean myBean) {this.myBean = myBean;}

    public void init(){
        System.out.println(myBean.getName());
    }
}
