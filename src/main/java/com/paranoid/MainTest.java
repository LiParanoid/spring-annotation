package com.paranoid;

import com.paranoid.bean.Person;
import com.paranoid.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Paranoid
 * @create 2019-12-01 0:16
 */
public class MainTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
////        Person person = (Person) applicationContext.getBean("person");
//        Person person = applicationContext.getBean(Person.class);
//        System.out.println(person);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = applicationContext.getBean(Person.class);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        for (String beanName : beanNamesForType) {
            System.out.println(beanName);
        }
        System.out.println(person);


    }
}
