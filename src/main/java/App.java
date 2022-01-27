import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pojo.Cat;


public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());
        Cat barsikCat = (Cat) applicationContext.getBean("grom");
        System.out.println(barsikCat.getName());
        Cat pushokCat =
                (Cat) applicationContext.getBean("priz");
        System.out.println(pushokCat.getName());

        System.out.println(bean == bean2);
        System.out.println(barsikCat == pushokCat);
    }
}

