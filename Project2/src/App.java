
class Student{
	int id;
	String first_name;
	String last_name;
	String department;
}

public class App {
	public static void main(String[] args) {
		Student st = new Student();
		st.id = 1001;
		st.first_name = "Ponraj";
		st.last_name = "Kannan";
		st.department = "CSE";
		
		System.out.println("Student id : " + st.id);
		System.out.println("Student first name : " + st.first_name);
		System.out.println("Student last name  : " + st.last_name);
		System.out.println("Student department : " + st.department);
	}
}