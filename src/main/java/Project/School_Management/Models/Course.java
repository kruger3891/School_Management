package Project.School_Management.Models;

import java.util.ArrayList;
import java.util.List;

import Project.School_Management.DataAccess.CourseDaoList;

public class Course {

	private static int Sequence = 1;
	private final int CourseID;
	private String CourseName;
	private int WeekDuration;
	private List<Student> students = new ArrayList<>();

	
	public Course(String courseName, int weekDuration) {
		CourseID = Sequence++;
		CourseName = courseName;
		WeekDuration = weekDuration;
		setStudents(new ArrayList<>());
	}
	public void AddStudentToCourse(Student student) {

	}

	public void RemoveStudentFromCourse(Student student) {

	}

	public int getCourseID() {
		return CourseID;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getWeekDuration() {
		return WeekDuration;
	}

	public void setWeekDuration(int weekDuration) {
		WeekDuration = weekDuration;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void ToPrint() {
		System.out.println(CourseID + " " + this.getCourseName() + " " + this.getWeekDuration()+" "+this.getStudents());

	}

	@Override
	public String toString() {
		return "Course [CourseID=" + CourseID + ", CourseName=" + CourseName + ", WeekDuration=" + WeekDuration
				+ ", students=" + this.getStudents() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + CourseID;
		result = prime * result + ((CourseName == null) ? 0 : CourseName.hashCode());
		result = prime * result + WeekDuration;
		result = prime * result + ((students == null) ? 0 : students.hashCode());
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
		Course other = (Course) obj;
		if (CourseID != other.CourseID)
			return false;
		if (CourseName == null) {
			if (other.CourseName != null)
				return false;
		} else if (!CourseName.equals(other.CourseName))
			return false;
		if (WeekDuration != other.WeekDuration)
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}

	
}
