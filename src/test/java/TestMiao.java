import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.txk.hellospring.pojo.People;

public class TestMiao {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people.getName());
        people.getCat().shout();
        people.getDog().shout();
    }
}
