package br.com.lucas.springdi;

import br.com.lucas.springdi.controllers.ConstructorInjectedController;
import br.com.lucas.springdi.controllers.MyController;
import br.com.lucas.springdi.controllers.PropertyInjectedController;
import br.com.lucas.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(SpringDiApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayGreeting();
        System.out.println(greeting);

        System.out.println("-------------");
        System.out.println("Com Property");

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("-------------");
        System.out.println("Com Setter");

        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("-------------");
        System.out.println("Com Construtor");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }
}