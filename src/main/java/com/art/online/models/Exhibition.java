package com.art.online.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="exhibition")
public class Exhibition implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	/**
	 * 
	 */
	public Exhibition() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long exhibition_id;
	
	@Column(name = "exhibition_name", length = 225)
	private String exhibitionName;
	
	@Column(name = "start_date", length = 225)
	private String startDate;
	
	@Column(name = "end_date", length = 225)
	private String endDate;
	
	@OneToMany(mappedBy = "exhibition")
	private Set<Painting> paintings;
	
	@ManyToOne
	@JoinColumn(name = "gallery_id", nullable= false)
	private Gallery gallery;


	/**
	 * @return the exhibition_id
	 */
	public long getExhibition_id() {
		return exhibition_id;
	}

	/**
	 * @param exhibition_id the exhibition_id to set
	 */
	public void setExhibition_id(long exhibition_id) {
		this.exhibition_id = exhibition_id;
	}

	/**
	 * @return the exhibitionName
	 */
	public String getExhibitionName() {
		return exhibitionName;
	}

	/**
	 * @param exhibitionName the exhibitionName to set
	 */
	public void setExhibitionName(String exhibitionName) {
		this.exhibitionName = exhibitionName;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
	 * @return the gallery
	 */
	public Gallery getGallery() {
		return gallery;
	}

	/**
	 * @param gallery the gallery to set
	 */
	public void setGallery(Gallery gallery) {
		this.gallery = gallery;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
