package testing.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
    	System.out.println("WELCOME");
    	LuxuryCar obj=context.getBean("LuxuryCar",LuxuryCar.class);
    	obj.speed();
    	obj.price();
        
    }
}
