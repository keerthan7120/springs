package springsdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo 
{
  public static void main(String args[])
  {
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
     
	  
	  CricketCoach thecoach = context.getBean("mycricket",CricketCoach.class);
	  
	  System.out.println(thecoach.getDailyWorkout());
	  System.out.println(thecoach.getEmailAddess());
	  System.out.println(thecoach.getTeam());
	  
	  context.close();
  }
}
