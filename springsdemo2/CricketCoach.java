package springsdemo1;

public class CricketCoach implements Coach {

	public FortuneService FortuneService; 
	
	public  CricketCoach(){
		System.out.println("inisd ethe setter");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside the setter methord");
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
	
		return "practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		
		return FortuneService.getFortune();
	}

}
