package org.diosoft.spring.el;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class MainXmlConfIlineMap {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config-el.xml");
        applicationContext.registerShutdownHook();

        ExpressionParser parser = new SpelExpressionParser();

        MyProjectionBean myProjectionBean = new MyProjectionBean();
        EvaluationContext evaluationContext = new StandardEvaluationContext(myProjectionBean);

        BigDecimal value = new BigDecimal("43");

        evaluationContext.setVariable("myVariable", value);

        parser.parseExpression("Price = #myVariable").getValue(evaluationContext);
        System.out.println("Price value " + myProjectionBean.getPrice());

        Map inventorInfo = (Map) parser.parseExpression("{name:'Nikola',dob:'10-July-1856'}").getValue(evaluationContext);

        Map mapOfMaps = (Map) parser.parseExpression("{name:{first:'Nikola',last:'Tesla'},dob:{day:10,month:'July',year:1856}}").getValue(evaluationContext);

        System.out.println("# inventorInfo " + inventorInfo);
        System.out.println("# mapOfMaps " + mapOfMaps);

        try {

            ExpressionParser spelParser = new SpelExpressionParser();
            StandardEvaluationContext context = new StandardEvaluationContext();

            context.registerFunction("randomUUID",
                    UUID.class.getDeclaredMethod("randomUUID"));

            UUID generatedUUID = spelParser.parseExpression(
                    "#randomUUID()").getValue(context, UUID.class);

            System.out.println("generatedUUID " + generatedUUID);

            String name = spelParser.parseExpression("null?:'N/A'").getValue(String.class);

            System.out.println(name); // Unknown
        }
        catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

}
