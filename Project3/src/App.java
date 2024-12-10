
class Student {
	private int id;
	private String first_name;
	private String last_name;
	private String department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

public class App {
	public static void main(String[] args) {
		Student st = new Student();
		st.setId(1001);
		st.setFirst_name("Ponraj");
		st.setLast_name("Kannan");
		st.setDepartment("CSE");

		System.out.println("Student id : " + st.getId());
		System.out.println("Student first name : " + st.getFirst_name());
		System.out.println("Student last name  : " + st.getLast_name());
		System.out.println("Student department : " + st.getDepartment());
	}
}