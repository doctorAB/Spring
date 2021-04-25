import com.liu.aop.UserServer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.liu
 * @title: Mytest
 * @projectName PACKAGE_NAME
 * @description: TODO
 * @date 2021/04/25 0:58
 */
public class Mytest {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        UserServer userServer = context.getBean("userServerImp",UserServer.class);
        userServer.add();
        userServer.delete();
    }
}
