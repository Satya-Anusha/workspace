package day.ten;

public class Person1 {
	private int age;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String address;
	private String interest;
	private double mobile;
		
		public Person1(){}
		
		public Person1(int age, String firstName, String lastName, String email,String gender,String address,String interest,double mobile) {
			super();
			this.age=age;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.gender =gender;
			this.address=address;
			this.interest=interest;
			this.mobile=mobile;
		}	
		
		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address= address;
		}
		public String getInterest() {
			return interest;
		}

		public void setInterest(String interest) {
			this.interest = interest;
		}
		public double getMobile() {
			return mobile;
		}

		public void setMobile(double mobile) {
			this.mobile = mobile;
		}
		

		
		@Override
		public String toString() {
			return "Employee [age=" + age + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email +",gender=" + gender +",Address=" + address + ",Interest="+ interest + ",Mobile=" + mobile + "]";
		}
		
}
