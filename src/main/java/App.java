import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorldBean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        /*System.out.println(helloWorldBean1.getMessage());*/
        HelloWorld helloWorldBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        /*System.out.println(helloWorldBean2.getMessage());*/
        Cat catBean1 =
                (Cat) applicationContext.getBean("cat");
        /*System.out.println(catBean1.getNick());*/
        Cat catBean2 =
                (Cat) applicationContext.getBean("cat");
        /*System.out.println(catBean2.getNick());*/

        System.out.println(helloWorldBean1 == helloWorldBean2);
        System.out.println(catBean1 == catBean2);
    }
}