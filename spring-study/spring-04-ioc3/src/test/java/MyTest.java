import com.liu.pojo.Man;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.liu
 * @title: MyTest
 * @projectName PACKAGE_NAME
 * @description: TODO
 * @date 2021/04/21 16:44
 */
public class MyTest {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Man man = (Man)context.getBean("man");
        man.show();

    }
}
