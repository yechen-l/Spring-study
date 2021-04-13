import com.lxx.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取spring上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring中的管理了，我们要使用，直接从里面取出来就行
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }

}
