package co.com.poli.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "instructors")
public class Instructor extends EntityBase {

	@Column(name="name")
	private String name;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "instructor")
	private List<Course> courses;

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
