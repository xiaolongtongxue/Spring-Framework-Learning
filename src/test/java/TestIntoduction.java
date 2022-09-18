import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.txk.hellospring.pojo.People;
import xyz.txk.hellospring.pojo.Person;

public class TestIntoduction {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);

    }
}
