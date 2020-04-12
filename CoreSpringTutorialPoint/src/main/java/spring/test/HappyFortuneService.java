package spring.test;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortue() {
		// TODO Auto-generated method stub
		return "Have a Nice day";
	}
	
	public void intiMethod() {
		System.out.println("init nethod");
	}
	
	public void destroyMethod() {
		System.out.println("destroy nethod");
	}

}
