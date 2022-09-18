import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xyz.txk.hellospring.config.MyConfig;
import xyz.txk.hellospring.pojo.Myself;

public class withjavaconfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Myself myself = (Myself) context.getBean("getmyself");
        System.out.println(myself);
    }
}
