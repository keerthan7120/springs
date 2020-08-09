package springsdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringWord {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
        	
		Coach theCoach = context.getBean("mycoach", Coach.class);
		
		
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
	     
	    context.close();
	}

}
