package Testing.spring3ioc;

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
    	ApplicationContext context =   
    		    new ClassPathXmlApplicationContext("ApplicationContext.xml");  
    	System.out.println( "Hello World!" );
    	Employee c=context.getBean("Employee",Employee.class);
    	c.show();
        
    }
}
