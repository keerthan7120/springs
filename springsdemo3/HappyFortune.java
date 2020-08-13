package springsdemo1;

public class HappyFortune implements FortuneService {

	@Override
	public String getFortune() {
		
		return "hello user";
	}

}
