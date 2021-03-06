// default package
// Generated 11/02/2015 10:46:16 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Teacher generated by hbm2java
 */
public class Teacher implements java.io.Serializable {

	private Integer idTeacher;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Set courses = new HashSet(0);

	public Teacher() {
	}

	public Teacher(String firstName, String lastName, Date dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public Teacher(String firstName, String lastName, Date dateOfBirth,
			Set courses) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.courses = courses;
	}

	public Integer getIdTeacher() {
		return this.idTeacher;
	}

	public void setIdTeacher(Integer idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Set getCourses() {
		return this.courses;
	}

	public void setCourses(Set courses) {
		this.courses = courses;
	}

}
