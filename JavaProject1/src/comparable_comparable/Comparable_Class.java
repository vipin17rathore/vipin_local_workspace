package comparable_comparable;

public class Comparable_Class implements Comparable<Comparable_Class> {

	int age;
	String name;
	
	public Comparable_Class(int age,String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Comparable_Class o) {
		if(age==o.age)
			return 0;
			else if(age>o.age) {
				return 1;
			}
			else {
				return -1;
			}
	}

}
