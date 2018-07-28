package com.art.online.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "artist")
public class Artist implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public Artist() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long artist_id;
	
	@Column(name = "name", length = 225)
	private String name;
	
	@Column(name = "phone", length = 225)
	private String phone;
	
	@OneToMany(mappedBy = "artist")
	private Set<ArtistAddress> artistAddress;
	
	@OneToMany(mappedBy = "artist")
	private Set<Gallery> galleries;
	
	@OneToMany(mappedBy = "artist")
	private Set<Painting> paintings;

	/**
	 * @return the artist_id
	 */
	public long getArtist_id() {
		return artist_id;
	}

	/**
	 * @param artist_id the artist_id to set
	 */
	public void setArtist_id(long artist_id) {
		this.artist_id = artist_id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the artistAddress
	 */
	public Set<ArtistAddress> getArtistAddress() {
		return artistAddress;
	}

	/**
	 * @param artistAddress the artistAddress to set
	 */
	public void setArtistAddress(Set<ArtistAddress> artistAddress) {
		this.artistAddress = artistAddress;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the galleries
	 */
	public Set<Gallery> getGalleries() {
		return galleries;
	}

	/**
	 * @param galleries the galleries to set
	 */
	public void setGalleries(Set<Gallery> galleries) {
		this.galleries = galleries;
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
	
}
