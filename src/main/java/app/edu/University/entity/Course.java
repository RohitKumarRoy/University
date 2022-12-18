package app.edu.University.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CourseTb")
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	
	@Id
	private int courseId;
	
	private String courseName;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="UserCourseTable",
	 joinColumns= {
			@JoinColumn(name="course_Id", referencedColumnName = "courseId")
	},
	 inverseJoinColumns = {
			 @JoinColumn(name="user_id", referencedColumnName= "userId")
	 })
	private List<User> users;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
