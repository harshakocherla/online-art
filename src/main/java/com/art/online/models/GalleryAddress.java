package com.art.online.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gallery_address")
public class GalleryAddress implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	public GalleryAddress() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long gallery_address_id;
	
	@Column(name = "first_line", length = 255)
	private String firstLine;
	
	@Column(name = "second_line", length = 255)
	private String secondLine;
	
	@Column(name = "city", length = 255)
	private String city;
	
	@Column(name = "state", length = 255)
	private String state;
	
	@Column(name = "zip", length = 255)
	private String zip;

	/**
	 * @return the gallery_address_id
	 */
	public long getGallery_address_id() {
		return gallery_address_id;
	}

	/**
	 * @param gallery_address_id the gallery_address_id to set
	 */
	public void setGallery_address_id(long gallery_address_id) {
		this.gallery_address_id = gallery_address_id;
	}

	/**
	 * @return the firstLine
	 */
	public String getFirstLine() {
		return firstLine;
	}

	/**
	 * @param firstLine the firstLine to set
	 */
	public void setFirstLine(String firstLine) {
		this.firstLine = firstLine;
	}

	/**
	 * @return the secondLine
	 */
	public String getSecondLine() {
		return secondLine;
	}

	/**
	 * @param secondLine the secondLine to set
	 */
	public void setSecondLine(String secondLine) {
		this.secondLine = secondLine;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	


}
