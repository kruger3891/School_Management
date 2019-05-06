package Project.School_Management.Models;

import java.util.ArrayList;
import java.util.List;

import Project.School_Management.DataAccess.CourseDao_impl;

public class Course {

	private static int sequence = 1;
	private final int courseId;
	private String courseName;
	private int weekDuration;
	private List<Student> students = new ArrayList<>();

	public Course(String courseName, int weekDuration) {
		super();
		courseId = sequence++;
		this.courseName = courseName;
		this.weekDuration = weekDuration;
		setStudents(new ArrayList<>());
	}

	public int getCourseID() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public static int getSequence() {
		return sequence;
	}

	public static void setSequence(int sequence) {
		Course.sequence = sequence;
	}

	public int getWeekDuration() {
		return weekDuration;
	}

	public void setWeekDuration(int weekDuration) {
		this.weekDuration = weekDuration;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void ToPrint() {
		System.out.println(courseId + " " + this.getCourseName() + " " + this.getWeekDuration());

	}

	@Override
	public String toString() {
		return "Course [CourseID=" + courseId + ", CourseName=" + courseName + ", WeekDuration=" + weekDuration
				+ ", students=" + students + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseId;
		result = prime * result + ((courseName == null) ? 0 : courseName.hashCode());
		result = prime * result + weekDuration;
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
		if (courseId != other.courseId)
			return false;
		if (courseName == null) {
			if (other.courseName != null)
				return false;
		} else if (!courseName.equals(other.courseName))
			return false;
		if (weekDuration != other.weekDuration)
			return false;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}

}
