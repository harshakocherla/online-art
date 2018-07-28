package com.art.online.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 
	 */
	public Login() {

	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long login_id;
	
	@Column(name = "email", length = 225)
	private String email;
	
	@Column(name = "user_type", length = 225)
	private String userType;

	@Column(name = "password", length = 225)
	private String password;
	
	@ManyToMany(mappedBy = "login")
	private Set<Painting> paintings;

	/**
	 * @return the login_id
	 */
	public long getLogin_id() {
		return login_id;
	}

	/**
	 * @param login_id the login_id to set
	 */
	public void setLogin_id(long login_id) {
		this.login_id = login_id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the userType
	 */
	public String getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(String userType) {
		this.userType = userType;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the paintings
	 */
	public Set<Painting> getPaintings() {
		return paintings;
	}

	/**
	 * @param paintings the paintings to set
	 */
	public void setPaintings(Set<Painting> paintings) {
		this.paintings = paintings;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
