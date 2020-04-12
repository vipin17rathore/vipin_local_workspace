package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();  //generaic arrayList by string
		ar.add("viin");
		ar.add("rahul");
		ar.add("abhi");
		ar.remove(2);
		
		/*for (int i=0;i<ar.size();i++){
			System.out.println("ar"+ar);
		}*/
		
		for(String ar1 : ar){
			System.out.println("Name::"+ar1);
		}
		 //non generaic arrayList by objcet
		ArrayList arL = new ArrayList();
		arL.add("vipim");
		arL.add(432);
		
		for (Object L :arL){
			System.out.println("arL"+L);
		}
		
		ArrayList<employee>arE = new ArrayList<employee>();  //generaic arrayList by objec in same class
		arE.add(new employee("vvv",10));
	
		for (employee el :arE){
			System.out.println("al"+el.name);
		}
		
		//generaic arrayList by object in diffrent  class
		Student st = new Student("sharma",65);
		Student st1 = new Student("ram",66);
		
		ArrayList<Student>stE = new ArrayList<Student>();
		stE.add(st);
		stE.add(st1);
		
		for (Student student :stE){
			System.out.println("al"+student.income);
		}
		
		ArrayList<String>abc = new ArrayList<String>();
		abc.add("b");
		abc.add("a");
		abc.add("d");
		
		Collections.sort(abc);
		for(String xys : abc){
			System.out.println(xys);
		}
		
	}
	
    static class employee{
    	String name;
    	int rollNo;
    	
    	employee(String name,int rollNo){
    		this.name= name;
    		this.rollNo=rollNo;
    		
    	}
		
	}
}
