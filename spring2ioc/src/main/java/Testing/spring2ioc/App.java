package Testing.spring2ioc;

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
    		    new ClassPathXmlApplicationContext("applicationContext.xml");  
    	System.out.println( "Hello World!" );
    	Person c=context.getBean("Person",Person.class);
    	c.display();
        
    }
}
