import com.liu.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.liu
 * @title: MyTest
 * @projectName PACKAGE_NAME
 * @description: TODO
 * @date 2021/04/21 10:17
 */
public class MyTest {
    public static void main(String[] args) {
        //获取spring存入的对象集合
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //获取实际的对象
        Hello hello = (Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
