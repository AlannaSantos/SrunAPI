package br.com.srun.model;

//import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long id;
	
	@NotEmpty(message = "Nome do usuário não pode ser nulo")
	@Column
	private String firstname;
	
	@NotEmpty(message = "Sobrenome do usuário não pode ser nula")
	@Column
	private String lastname;
	
	@NotEmpty(message = "Email do usuário não pode ser nula")
	@Column(unique = true)
	private String email;
	
	@NotEmpty(message = "Senha do usuário não pode ser nula")
	@Column(unique = true)
	private String password;

	@JsonInclude(JsonInclude.Include.NON_NULL)
	@Transient
	private String token;
	/*private String image;
	@Column
	private LocalDate birthDate;
	@Column
	private String gender;
	@Column
	private Double weight;
	@Column
	private Double height;*/
	
	
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
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
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
	}*/
}
