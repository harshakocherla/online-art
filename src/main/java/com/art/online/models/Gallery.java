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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="gallery")
public class Gallery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * 
	 */
	public Gallery() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long gallery_id;
	
	@Column(name = "g_name", length = 225)
	private String gName;
	
	@Column(name = "url", length = 225)
	private String url;
	
	@OneToOne(cascade = CascadeType.ALL)
	private GalleryAddress galleryAddress;

	
	@OneToMany(mappedBy = "gallery")
    Set<Exhibition> exhibition;


	/**
	 * @return the gallery_id
	 */
	public long getGallery_id() {
		return gallery_id;
	}


	/**
	 * @param gallery_id the gallery_id to set
	 */
	public void setGallery_id(long gallery_id) {
		this.gallery_id = gallery_id;
	}


	/**
	 * @return the gName
	 */
	public String getgName() {
		return gName;
	}


	/**
	 * @param gName the gName to set
	 */
	public void setgName(String gName) {
		this.gName = gName;
	}


	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}


	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 * @return the galleryAddress
	 */
	public GalleryAddress getGalleryAddress() {
		return galleryAddress;
	}


	/**
	 * @param galleryAddress the galleryAddress to set
	 */
	public void setGalleryAddress(GalleryAddress galleryAddress) {
		this.galleryAddress = galleryAddress;
	}


	/**
	 * @return the exhibition
	 */
	public Set<Exhibition> getExhibition() {
		return exhibition;
	}


	/**
	 * @param exhibition the exhibition to set
	 */
	public void setExhibition(Set<Exhibition> exhibition) {
		this.exhibition = exhibition;
	}


	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}

