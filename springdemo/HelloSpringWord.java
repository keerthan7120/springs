package springsdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringWord {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
        	
		Coach theCoach = context.getBean("mycoach", Coach.class);
		Coach theCoach1 = context.getBean("mycoach1", Coach.class);
	    System.out.println(theCoach.getDailyWorkout());
	    System.out.println(theCoach1.getDailyWorkout()); 
	    context.close();
	}

}
