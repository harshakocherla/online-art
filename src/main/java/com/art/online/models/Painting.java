package com.art.online.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="painting")
public class Painting implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public Painting() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long painting_id;
	
	@Column(name = "title", length = 225)
	private String title;
	
	@Column(name = "year", length = 225)
	private String year;
	
	@Column(name = "url", length = 225)
	private String url;
	
	@Column(name = "type", length = 225)
	private String type;
	
	@Column(name = "size", length = 225)
	private String size;
	
	@OneToOne(cascade= CascadeType.ALL)
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "exhibition_id", nullable= false)
	private Exhibition exhibition;
	
	@ManyToOne
	@JoinColumn(name = "artist_id", nullable= false)
	private Artist artist;
	

	@OneToMany(mappedBy = "painting",cascade = CascadeType.ALL)
	private Set<Likes> likes;

	/**
	 * @return the painting_id
	 */
	public long getPainting_id() {
		return painting_id;
	}


	/**
	 * @param painting_id the painting_id to set
	 */
	public void setPainting_id(long painting_id) {
		this.painting_id = painting_id;
	}


	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}


	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}


	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}


	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}


	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	/**
	 * @return the exhibition
	 */
	public Exhibition getExhibition() {
		return exhibition;
	}


	/**
	 * @param exhibition the exhibition to set
	 */
	public void setExhibition(Exhibition exhibition) {
		this.exhibition = exhibition;
	}


	/**
	 * @return the artist
	 */
	public Artist getArtist() {
		return artist;
	}


	/**
	 * @param artist the artist to set
	 */
	public void setArtist(Artist artist) {
		this.artist = artist;
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
