import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        Cat scope =
                (Cat) applicationContext.getBean("cat");
        System.out.println(scope.getMessage());
        Cat scope1 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(scope1.getMessage());

        System.out.println(bean1==bean);
        System.out.println(scope1==scope);
    }
}