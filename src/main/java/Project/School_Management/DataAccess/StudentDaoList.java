package Project.School_Management.DataAccess;

import java.util.*;
import java.util.stream.Collectors;
import Project.School_Management.Models.Student;



public class StudentDaoList implements StudentDAO {

	private static List<Student> StudentList = new ArrayList<Student>();
	static StudentDaoList theStudentList = new StudentDaoList();
	Set<Student>set = StudentList.stream()
			.collect(Collectors.toSet());

	@Override
	public Student saveStudent(Student STD) throws IllegalArgumentException {
		if (STD == null) {
			throw new IllegalArgumentException();
		} else {
			StudentList.add(STD);
			return STD;
		}
	}

	@Override
	public Student findByEmail(String email) {
		for (Student STD : StudentList) {
			if (STD.getEmail().equals(email)) {
				return STD;
			}
		}
		return null;
	}

	@Override
	public List<Student> findByName(String name) {
		List<Student> result = new ArrayList<>();
		for (Student STD : StudentList) {
			if (STD.getName().equalsIgnoreCase(name)) {
				result.add(STD);
			}
		}
		return result;
	}

	public Student findById(int id) {
		for (Student STD : StudentList) {
			if (STD.getID() == id) {
				return STD;
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
		for (Student STD : StudentList) {
			System.out.println("Student Has Been Removed");
			return StudentList.remove(STD);
		}
		return false;
	}

	@Override
	public Student AddToCourse(String name) {
		
		return null;

	}

}