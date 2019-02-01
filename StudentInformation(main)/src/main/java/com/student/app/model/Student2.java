package com.student.app.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "student2")
public class Student2 implements Serializable {

	private static final long serialVersionUID = -3009157732242241606L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id") // updatable = false, nullable = false
	private Long id;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "gender")
	private String gender;

	@Column(name = "hobby")
	private String hobby;

	@Column(name = "country")
	private String country;

	@Column(name = "roll")
	private long roll;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth")
	private Date date_of_birth;

	public String getfirst_name() {
		return first_name;
	}

	public void setfirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getlast_name() {
		return last_name;
	}

	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getRoll() {
		return roll;
	}

	public void setRoll(long roll) {
		this.roll = roll;
	}

	public Date getdate_of_birth() {
		return date_of_birth;
	}

	public void setdate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Student2() {
	}

	public Student2(String first_name, String last_name, String gender, String hobby, String country, long roll,
			Date date_of_birth) {

		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.hobby = hobby;
		this.country = country;
		this.roll = roll;
		this.date_of_birth = date_of_birth;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender
				+ ", hobby=" + hobby + ", country=" + country + ", roll=" + roll + ", date_of_birth=" + date_of_birth
				+ "]";
	}

}