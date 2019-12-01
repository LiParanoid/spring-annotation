package com.paranoid.test;

import com.paranoid.config.MainConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Paranoid
 * @create 2019-12-01 22:26
 */
public class MainTest {

    @Test
    public void testXmlComponentScan(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void testAnnotationComponentScan(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
