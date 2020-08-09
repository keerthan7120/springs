package springsdemo1;

public class TrackCoach implements Coach {

	private FortuneService   FortuneService ;
	
	public TrackCoach(springsdemo1.FortuneService fortuneService) {
		super();
		FortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "run hard 5km";
}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}}
