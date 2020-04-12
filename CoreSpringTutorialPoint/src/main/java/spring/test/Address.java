package spring.test;

public class Address {

	private String street;
	private String zip;
	
	Address(String street,String zip){
		this.street=street;
		this.zip=zip;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zip=" + zip + "]";
	}
	
}
