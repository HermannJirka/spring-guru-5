package cz.tut.guru.spring.didemo;

import cz.tut.guru.spring.didemo.controllers.ConstructorController;
import cz.tut.guru.spring.didemo.controllers.MyController;
import cz.tut.guru.spring.didemo.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) context.getBean("myController");
        String hello = controller.hello();
        System.out.println(hello);

        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(context.getBean(ConstructorController.class).sayHello());
        System.out.println(context.getBean(PropertyInjectedController.class).sayHello());

    }

}
