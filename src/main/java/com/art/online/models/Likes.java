package com.art.online.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="likes")
public class Likes {

	/**
	 * 
	 */
	public Likes() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "painting_id", nullable= false)
	private Painting painting;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "login_id", nullable= false)
	private Login login;

	/**
	 * @return the painting
	 */
	public Painting getPainting() {
		return painting;
	}

	/**
	 * @param painting the painting to set
	 */
	public void setPainting(Painting painting) {
		this.painting = painting;
	}

	/**
	 * @return the login
	 */
	public Login getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(Login login) {
		this.login = login;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
}
