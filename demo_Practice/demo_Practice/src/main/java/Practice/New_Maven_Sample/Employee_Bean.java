package Practice.New_Maven_Sample;

public class Employee_Bean {
	
		private int id;
		private String name;
		private String position;
		private double salary;
		private String department;
		private String email;
		//Employee(){}
		
		public Employee_Bean(int id, String name, String position, double salary, String department, String email) {
			super();
			this.id = id;
			this.name = name;
			this.position = position;
			this.salary = salary;
			this.department = department;
			this.email = email;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary
					+ ", department=" + department + ", email=" + email + "]";
		}
		
		// properly working : =C:\\Users\\Divya\\Documents\\hari.txt

}
