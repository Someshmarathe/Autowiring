package in.sp.main;

import in.sp.bean.Student;
import in.sp.resource.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Student std = (Student) context.getBean("student");
        System.out.println(std);
    }
}