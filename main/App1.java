package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1=(Cat) applicationContext.getBean("cat");
        Cat cat2=(Cat) applicationContext.getBean("cat");
        System.out.println(bean1.getMessage());
        boolean cc1=(cat1==cat2);
        boolean cc2=(bean1==bean2);
        System.out.println(cc1);
        System.out.println(bean1);
        System.out.println(bean2);
         System.out.println(cc2);
        System.out.println(cat1);
        System.out.println(cat2);

    }
}