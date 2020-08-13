package springsdemo1;

public class CricketCoach implements Coach {
	

	public FortuneService FortuneService; 
	
	private String emailAddess;
	private String team;
	
	public String getEmailAddess() {
		return emailAddess;
	}

	public void setEmailAddess(String emailAddess) {
		this.emailAddess = emailAddess;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String Team){
	System.out.println("inside the setter methord fo set email");
		this.team = Team;
	}

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

