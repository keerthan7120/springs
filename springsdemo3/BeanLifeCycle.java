package springsdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle 
{

	 public static void main(String args[])
	 {
		 ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("beanlifecycle_applicationContext.xml"); 
		 
		 Coach thecoach=context.getBean("mycoach", Coach.class);
		 
		 System.out.println(thecoach.getDailyWorkout());
		 System.out.println(thecoach.getDailyFortune());
		 context.close();
		 
		
		 
			 }
	 
	}


