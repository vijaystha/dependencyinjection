import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {



        ApplicationContext context = new ClassPathXmlApplicationContext("src/beans.xml");
       Student abhi= context.getBean("student", Student.class);
        abhi.displayStudentInfo();


    }
}
