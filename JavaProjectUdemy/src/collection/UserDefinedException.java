package collection;

public class UserDefinedException {

	public static void main(String[] args) {
		int i=0;
		try{
		if(i<4){
			int k = 10/i;
			throw new myException("errro"); 
	     }
		}catch(myException e){
			
		}
	}
}
class myException extends Exception{
	
	public myException(String msg) {
		super(msg);
	}
}