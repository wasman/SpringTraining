package org.diosoft.spring.el;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.AbstractMap;
import java.util.List;

public class MainXmlConf {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-el.xml");
        applicationContext.registerShutdownHook();

        ExpressionParser parser = new SpelExpressionParser();

        MyProjectionBean myProjectionBean = new MyProjectionBean();
        myProjectionBean.add(new AbstractMap.SimpleImmutableEntry<>("key", "value"));
        myProjectionBean.add(new AbstractMap.SimpleImmutableEntry<>("key1", "value2"));
        EvaluationContext evaluationContext = new StandardEvaluationContext(myProjectionBean);


        List values = (List)parser.parseExpression("specialCollection.![value]").getValue(evaluationContext);
        System.out.println("# values " + values);


    }

}
