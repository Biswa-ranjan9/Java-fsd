
public class ClassAndObject {
	String name;  
    int age; 
    String Address;
    
	public ClassAndObject(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		Address = address;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	 
	
	@Override
	public String toString() {
		return "Biswa [name=" + name + ", age=" + age + ", Address=" + Address + "]";
	}

	public static void main(String[] args) {
		ClassAndObject a=new ClassAndObject("Ranjan ",24,"Jajpur");
		System.out.println(a.toString() );
	}
    


}
