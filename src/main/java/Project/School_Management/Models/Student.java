package Project.School_Management.Models;

public class Student {

	private static int Sequence = 1000;
	private final int ID;
	private String Name;
	private String Email;
	private String Address;
	private String Course;

	@Override
	public String toString() {

		return "Student [ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", Address=" + Address + ", Course="
				+ Course + "]";
	}

	public Student(String name, String email, String address, String course) {
		super();
		this.ID = ++Sequence;
		this.Name = name;
		this.Email = email;
		this.Address = address;
		this.Course = course;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public void ToPrint() {

		System.out.println("[ " +"Student ID"+" "+this.getID() + "Student Name"+ " " + this.Name + "Student Email"+" " + this.Email + "Student Address"+" " + this.Address +"]");

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((Course == null) ? 0 : Course.hashCode());
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ID;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (Course == null) {
			if (other.Course != null)
				return false;
		} else if (!Course.equals(other.Course))
			return false;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (ID != other.ID)
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}
	
}