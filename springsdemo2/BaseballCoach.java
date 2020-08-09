package springsdemo1;

public class  BaseballCoach implements Coach 
{
   private FortuneService fortuneservice;
   
   public BaseballCoach(FortuneService theFortuneService){
	   fortuneservice = theFortuneService;
   }
	public String getDailyWorkout()
	{
		return " spend 30 min daily work out";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneservice.getFortune();
	}
}
