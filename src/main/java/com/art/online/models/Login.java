package com.art.online.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany(mappedBy = "login",cascade = CascadeType.ALL)
	private Set<Likes> likes;

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
	 * @return the likes
	 */
	public Set<Likes> getLikes() {
		return likes;
	}

	/**
	 * @param likes the likes to set
	 */
	public void setLikes(Set<Likes> likes) {
		this.likes = likes;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
