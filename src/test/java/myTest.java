import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.txk.hellospring.pojo.*;

import java.util.Arrays;

public class myTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");

//        Hello hello = (Hello) context.getBean("hello");
//        System.out.println(hello);

//        Users users = (Users) context.getBean("users");
//        System.out.println(users);
        /*
        {
            Student student_name = (Student) context.getBean("student-name");
            System.out.println(student_name.getName());
            ////////////////////////////////////////////
            Student student_address = (Student) context.getBean("student-address");
            System.out.println(student_address.getAddress());
            ////////////////////////////////////////////
            Student student_books = (Student) context.getBean("student-books");
            System.out.println(Arrays.toString(student_books.getBooks()));
            ////////////////////////////////////////////
            Student student_hobbys = (Student) context.getBean("student-hobbys");
            System.out.println(student_hobbys.getHobbys());
            ////////////////////////////////////////////
            Student student_card = (Student) context.getBean("student-card");
            System.out.println(student_card.getCard());
            ////////////////////////////////////////////
            Student student_games = (Student) context.getBean("student-games");
            System.out.println(student_games.getGames());
            ////////////////////////////////////////////
            Student student_girlfriend = (Student) context.getBean("student-girlfriend");
            System.out.println(student_girlfriend.getGirlfriend());
            ////////////////////////////////////////////
            Student student_info = (Student) context.getBean("student-info");
            System.out.println(student_info.getInfo());
            ////////////////////////////////////////////
        }
        */
        Student student = context.getBean("student",Student.class);
        System.out.println(student);


    }
}
