package spring.test;

public class Cricket implements Coach {

	private FortuneService fortuneService;
	
	public Cricket(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String dailyWorkOut() {
	 return "Cricket coach work 5K";	
	}

	@Override
	public String getDailyFortue() {
		return fortuneService.getDailyFortue();
	}

	public void destroyMethod() {
		System.out.println("destroy nethod");
	}
}
