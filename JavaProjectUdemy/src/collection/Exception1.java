package collection;

public class Exception1 {

	public static void main(String[] args) throws Exception {
		
		try
		{
			int i=5;
			int j=0;
			int k = i/j;
			throw new ArithmeticException();
		}
		catch(Exception e){
			System.out.println("error"+e);
			}
		finally{
		System.out.println("elase part");
		
		}
		}

}
