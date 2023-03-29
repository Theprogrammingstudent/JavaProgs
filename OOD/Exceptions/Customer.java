package Mulkerrins_Alex_3049679_Lab08_Eclipse;

//Alex Mulkerrins - 3049679

public class Customer implements Comparable<Customer>{

	//Data fields
	
	/* Create a static variable that will count the number of objects being created 
	 * this will assign the id to each object - "idCounter".
	 * 
	 * Assign this static variable to the int id to show the id of each object.
	 */
	static int idCounter = 1;
	int id;
	
	/**As in the question declare three variables age, name phone number*/
	int age;
	String name;
	String phoneNo;
	
	
	
	//Constructor
	
	/**Create a constructor to initialise age, name and phone number
	 * invoke the increment id method to get id for each object.
	 * Then invoke the setter methods to initialise the variables as in the question*/
	Customer (int newAge, String newName, String newPhoneNo){
		
		
		
		setAge(newAge);
		setName(newName);
		setPhoneNo(newPhoneNo);
		//This auto generates id
				incrementId();
	}

	
	
	//Methods
	
	//Getters and Setters methods for age, name and number.
	//returns age.
	public int getAge() {
		return age;
	}

	//newAge
	public void setAge(int newAge) {
		this.age = newAge;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}


	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String newPhoneNo) {
		this.phoneNo = newPhoneNo;
	}
	
	
	//auto id method
	/**When invoked in the constructor, this method will increment
	 * the static variable idCounter and assign the new value to the object id variable id.*/
	public int incrementId() {
		return id = idCounter++;
	}
	
	
	
	//compareTo method from Comparable interface.
	/**This overridden compareTo method from the
	 * comparable interface will be invoked when Collection.sort(al) is called.
	 * It will compare each customer object based on age an put them in ascending order of age,
	 * as in the question.*/
	@Override
	public int compareTo(Customer o) {
		    
		//if equal return 0
		 if(age == o.age) {    
			 return 0;
		 }
		 
		 //if less than return -1
		 else if(age < o.age) {
			 return -1;
		 }
			 
		 //or else return 1.
		 else  {
			 return 1; 
		 }
			     
			   
	}
	
	//toString method
	/**Overridden toString method returns id name phone number & age in specified order.*/
	@Override
	public String toString() {
		return id + " " + name + ", " + phoneNo + ", " + age;
	}

}
