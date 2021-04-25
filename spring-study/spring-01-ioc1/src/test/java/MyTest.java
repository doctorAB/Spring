import com.liu.dao.UserDaoImp;
import com.liu.dao.UserDaoMysqlImp;
import com.liu.server.UserServer;
import com.liu.server.UserServerImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mr.liu
 * @title: MyTest
 * @projectName PACKAGE_NAME
 * @description: TODO
 * @date 2021/04/20 17:06
 */
public class MyTest {
    public static void main(String[] args) {
//        UserServer userServer = new UserServerImp();
//        userServer.setUserDao(new UserDaoMysqlImp());
//        userServer.getUser();
        //获取spring存入的对象集合
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //获取实际的对象
        UserServer userServer = (UserServer) context.getBean("userServerImp");
        userServer.getUser();
    }
}
