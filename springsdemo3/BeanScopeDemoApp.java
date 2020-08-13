package springsdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp 
{
 public static void main(String args[])
 {
	 ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beansope_applicationContext.xml"); 
	 
	 Coach thecoach=context.getBean("mycoach", Coach.class);
	 
	 Coach thecoach1=context.getBean("mycoach", Coach.class);
	 
	 boolean result =thecoach.equals(thecoach1);
	 
	 System.out.println("result:" +result);
	 
	 System.out.println("object refrence os thecoach:" +thecoach);
	 System.out.println("object refrence os thecoach:" +thecoach1);
	 
 }
 
}
