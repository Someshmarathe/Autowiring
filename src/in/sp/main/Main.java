package in.sp.main;

import in.sp.bean.Student;
import in.sp.resource.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // xml based autowiring
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/sp/resource/ApplicationConfig.xml");
        Student std = (Student) context.getBean("student");
        System.out.println(std);
    }
}
