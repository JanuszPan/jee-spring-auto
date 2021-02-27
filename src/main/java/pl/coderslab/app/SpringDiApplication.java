package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.bean.PersonService;
import pl.coderslab.config.Config;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        PersonService person = context.getBean(PersonService.class);
        System.out.println(person.getPersonRepo().getClass().getName());
    }
}
