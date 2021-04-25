import com.liu.aop.UserServer;
import com.liu.aop.UserServerImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.liu
 * @title: MyTest
 * @projectName PACKAGE_NAME
 * @description: TODO
 * @date 2021/04/24 23:44
 */
public class MyTest {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserServer userServer = context.getBean("userServerImp",UserServer.class);
        userServer.add();
        userServer.delete();
    }
}
