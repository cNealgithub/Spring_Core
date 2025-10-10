package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class testMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spelConfig.xml");
        Demo d1 = context.getBean("demo", Demo.class);
        System.out.println(d1);
        //manually describe and check spEL
        SpelExpressionParser spel = new SpelExpressionParser();
        Expression expression = spel.parseExpression("22+48");
        System.out.println(expression.getValue());
    }
}
