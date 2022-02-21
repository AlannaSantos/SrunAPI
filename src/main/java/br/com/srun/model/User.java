package br.com.srun.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.srun.model.enumeration.UserStatus;
// import lombok.AccessLevel;
// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.Getter;
// import lombok.RequiredArgsConstructor;
// import lombok.Setter;

@Entity
@Table(name = "tb_user")
//@Getter
//@Setter
//@AllArgsConstructor
//@RequiredArgsConstructor
//@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long id;
	
	@NotEmpty(message = "Nome do usuário não pode ser nulo")
	@Column(name = "first_name")
	private String firstname;
	
	@NotEmpty(message = "Sobrenome do usuário não pode ser nula")
	@Column(name = "last_name")
	private String lastname;
	
	@NotEmpty(message = "Email do usuário não pode ser nula")
	@Column(unique = true)
	private String email;
	
    //@Setter
	@NotEmpty(message = "Senha do usuário não pode ser nula")
	@Column(unique = true)
	private String password;
    
    /*@JsonIgnore
    public String getPassword() { return password; }*/

	@Column(name = "birth_date")
	private Date birthdate;
	
	@Column
	private String gender;
	
	@Column
	private Double weight;
	
	@Column
	private Double height;

	@Enumerated(EnumType.STRING)
	private UserStatus status;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String token;
	
	public User(){

	}
	//Getters and Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonIgnore
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	/*public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}*/
	
	public Date getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}

	public UserStatus getStatus() {
		return status;
	}

	public void setStatus(UserStatus status) {
		this.status = status;
	}
}
