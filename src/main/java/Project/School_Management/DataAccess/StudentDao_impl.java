package Project.School_Management.DataAccess;

import java.util.*;
import java.util.stream.Collectors;
import Project.School_Management.Models.Student;


public class StudentDao_impl implements StudentDAO {

	private List<Student> StudentList = new ArrayList<Student>();
	Set<Student> set = StudentList.stream().collect(Collectors.toSet());

	@Override
	public Student saveStudent(Student std) throws IllegalArgumentException {
		if (std == null) {
			throw new IllegalArgumentException();
		} else {
			StudentList.add(std);
			return std;
		}
	}

	@Override
	public List<Student> findByEmail(String email) {
		List<Student> result = new ArrayList<>();
		for (Student std : StudentList) {
			if (std.getEmail().equals(email)) {
				result.add(std);
			}
		}
		return result;
	}

	@Override
	public List<Student> findByName(String name) {
		List<Student> result = new ArrayList<>();
		for (Student std : StudentList) {
			if (std.getName().equalsIgnoreCase(name)) {
				result.add(std);
			}
		}
		return result;
	}
	
	@Override
	public Student findById(int id) {
		for (Student std : StudentList) {
			if (std.getID() == id) {
//				std.toPrint();
				return std;
			}
		}
		return null;
	}

	@Override
	public List<Student> findAll() {
		return StudentList;
	}

	@Override
	public boolean deleteStudent(Student student) {
		for (Student std : StudentList) {
			System.out.println("Student Has Been Removed");
			return StudentList.remove(std);
		}
		return false;
	}

}