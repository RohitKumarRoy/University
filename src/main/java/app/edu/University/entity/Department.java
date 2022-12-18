package app.edu.University.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="DepartmentTb")
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	@Id
	private int departmentId;
	
	@Column(nullable=false)
	private String departmentName;
	
	@OneToMany(targetEntity=User.class, cascade = CascadeType.ALL)
	@JoinColumn(name="Dep_Usr_Fk", referencedColumnName = "departmentId")
	private List<User> users;


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}
}
